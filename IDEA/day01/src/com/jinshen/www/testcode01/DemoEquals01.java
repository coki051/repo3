package com.jinshen.www.testcode01;

public class DemoEquals01 {
    public static void main(String[] args) {
        String str1 = "liujinshen";
        String str2 = "Liujinshen";
        System.out.println("liujinshen".equals(str1));
        System.out.println(str2.equals(str1));
        System.out.println("liujinshen".equalsIgnoreCase(str1));
        System.out.println(str2.equalsIgnoreCase(str1));
    }
}
