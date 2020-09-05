package com.jinshen.www.testcode01;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        PrintArrayList(list);
    }

    private static void PrintArrayList(ArrayList<Integer> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(i + "}");
            }else {
                System.out.print(i + "@");
            }
        }
    }
}
