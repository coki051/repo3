package com.jinshen.www.testcode01;


import java.util.ArrayList;

public class HelloWorld1 {



    public static void main(String[] args) {

//   打印 Hello World !!!
        System.out.println("Hello World !!!");

        ArrayList <String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        System.out.println(list);
        System.out.println("================");
        System.out.println(list.get(2));
        System.out.println("===========");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println("============");
        System.out.println(list.size());



    }



}