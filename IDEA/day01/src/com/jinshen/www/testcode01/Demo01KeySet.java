package com.jinshen.www.testcode01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("liujinshen01",23);
        map.put("liujinshen02",24);
        map.put("liujinshen03",25);

        System.out.println(map);

//        Set<String> set = map.keySet();

        //meth01(map, set);
        //meth02(map, set);


        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " = " + value);
        }

        System.out.println("===============");

        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key  + " = " + value);
        }


    }

    private static void meth02(Map<String, Integer> map, Set<String> set) {
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

    private static void meth01(Map<String, Integer> map, Set<String> set) {
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

}
