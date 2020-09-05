package com.jinshen.www.testcode01;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }

        ArrayList<Integer> smallList = GetMinList(bigList);
        System.out.println("偶数个数有: " + smallList.size() +" 个");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }


    }

    private static ArrayList<Integer> GetMinList(ArrayList<Integer> bigList) {
        ArrayList<Integer> minList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i) % 2 ==0) {
                int num1 = bigList.get(i);
                minList.add(num1);
            }
        }
        return  minList;

    }


}
