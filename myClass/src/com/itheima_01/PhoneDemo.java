package com.itheima_01;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone p = new Phone("小米",3000);

        System.out.println(p.brand);
        System.out.println(p.getPrice());
        p.setPrice(20);
        p.call();
        System.out.println(p.getPrice());
    }
}
