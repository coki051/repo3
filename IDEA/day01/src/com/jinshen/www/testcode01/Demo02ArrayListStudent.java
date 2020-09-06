package com.jinshen.www.testcode01;

import com.jinshen.www.bean.Student;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        Student st1 = new Student("张三",23);
        Student st2 = new Student("李四",24);
        Student st3 = new Student("王五",25);
        Student st4 = new Student("赵六",26);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        
        
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("名字叫: " + stu.getName() + " 年龄为: " + stu.getAge());
        }
    }
}
