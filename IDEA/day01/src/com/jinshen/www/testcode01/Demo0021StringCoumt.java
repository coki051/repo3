package com.jinshen.www.testcode01;

import java.util.Scanner;

public class Demo0021StringCoumt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串 ");
        String input = sc.next();

        int daxie = 0;
        int xiaoxie = 0;
        int shuzi = 0;
        int qita = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <='Z'){
                daxie++;
            }else if ('a' <= ch && ch <='z'){
                xiaoxie++;
            }else if ('0' <= ch && ch <='9'){
                shuzi++;
            }else{
                qita++;
            }
        }
        System.out.println("daxie :" +daxie);
        System.out.println("xiaoxie : " +xiaoxie);
        System.out.println("shuzi : " +shuzi);
        System.out.println("qita : " +qita);

    }
}
