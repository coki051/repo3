package com.jinshen.www.testcode01;

public class Demo0011Get {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String array1 = GetArray(array);
        System.out.println(array1);
    }

    private static String GetArray(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "world" + array[i] + "]";
            } else {

                str += "world" + array[i] + "#";
            }
        }
        return str;
    }
}
