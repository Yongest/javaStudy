package com.itheima_01;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
//        ArrayList<String> array= new ArrayList<>();
        ArrayList<String> array= new ArrayList<String>();
        array.add("ok");
        array.add("ok2");
        array.add("ok3");
        array.add(3,"ss");

        System.out.println(array);

        System.out.println(array.get(1));
        array.remove("ok");
        System.out.println(array);
        array.remove(1);
        System.out.println(array);
    }
}
