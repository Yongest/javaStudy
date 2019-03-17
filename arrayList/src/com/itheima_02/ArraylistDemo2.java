package com.itheima_02;

import java.util.ArrayList;

public class ArraylistDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("zhangshan",15);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王二",22);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        for (int i = 0;i<array.size();i++){
            System.out.println(array.get(i).getName()+"----------"+array.get(i).getAge());
        }

    }
}
