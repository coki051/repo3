package com.jinshen.www.testcode01;


import com.jinshen.www.bean.Person;

import java.sql.SQLOutput;
import java.util.*;

public class Demo0111HashMapToPerson {
    public static void main(String[] args) {
//        meth01();

//        meth02();

//        meth03();
        Demo03();

    }

    private static void Demo03() {
        //准备牌
//  创建一个map集合,存储牌索引和创建好的牌
        HashMap<Integer, String> poke = new HashMap<>();
//  创建一个LIST集合,存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
//        定义两个集合存储牌的花色和序号
        List<String> colors = List.of("♠", "♥", "♦", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
//        把大小王存储到集合中
//        定义一个牌的索引
        int index = 0;
        poke.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poke.put(index, "小王");
        pokerIndex.add(index);
        index++;

//        循环遍历两个集合,组装52张牌,存储到集合中
        for (String color : colors) {
            for (String number : numbers) {
                poke.put(index, number + color);
                pokerIndex.add(index);
                index++;

            }
        }

//        洗牌
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);

//        发牌
//        定义四个集合,存储玩家和底牌的索引
        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> play03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

//        遍历存储索引的List集合,获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
//            先判断底牌
            if (i >= 51) {
//                给底牌发牌
                dipai.add(in);
            } else if (i % 3 == 0) {
//                给玩家1发牌
                play01.add(in);
            } else if (i % 3 == 1) {
//                给玩家2发牌
                play02.add(in);
            } else if (i % 3 == 2) {
//                给玩家3发牌
                play03.add(in);
            }

        }

        //            给牌排序
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(dipai);

        kanpai("张三",poke,play01);
        kanpai("李四",poke,play02);
        kanpai("王五",poke,play03);
        kanpai("底牌",poke,dipai);




    }

    //            定义一个看牌方法
    public static void kanpai (String name, HashMap < Integer, String > poker, ArrayList < Integer > list){
//                输出玩家名称
        System.out.print(name + " : ");
//                比那里玩家或底牌集合,获取牌的索引
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }

    
    

    private static void meth03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串 : ");
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer val = map.get(c);
                val++;
                map.put(c, val);
            } else {
                map.put(c, 1);
            }
        }

        for (Character key : map.keySet()) {
            Integer val = map.get(key);
            System.out.println(key + " = " + val);
        }
    }

    private static void meth02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("LI", 23), "LI");
        map.put(new Person("LI", 23), "LIOO");
        map.put(new Person("LII", 23), "LIP");
        map.put(new Person("LIU", 23), "LIO");

        Set<Map.Entry<Person, String>> set = map.entrySet();

        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " = " + value);
        }
    }

    private static void meth01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("li", new Person("ZHANGSAN", 23));
        map.put("li", new Person("LISI", 24));
        map.put("WANG", new Person("WANGWU", 25));
        map.put("ZHAO", new Person("ZHAOLIU", 26));

        Set<String> set = map.keySet();
        for (String key : set) {
            Person val = map.get(key);

            System.out.println(key + "--->" + val);
        }
    }
}


