package com.jinshen.www.testcode01;

import java.util.Scanner;

public class test0001 {
    static String[] usernames = {"张三","李松","王五","赵六"};

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String username = sc.next();
        checkUsername(username);

    }

    public static void checkUsername(String username)  {
        for (String name : usernames) {
            if (name.equals(username)){
                    throw  new RegisterException("用户名已存在,请重新输入");
            }
        }
        System.out.println("恭喜您,注册成功.");
    }
}
