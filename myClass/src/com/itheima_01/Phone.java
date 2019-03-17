package com.itheima_01;

/*
* 类是Java程序中基本组成单位
* 1.建立myClass 模块，2.建立com.itheima_01 包，3.建立类 Phone
*
*
* */

//定义了类的属性与方法。
public class Phone {
    String brand;
//    私有属性
   private int price;

   public int getPrice(){
       return  price;
   }
   public void  setPrice(int price){
       this.price = price;
   }

//    构造函数
    public Phone(){
        System.out.println("我是构造函数");
    }
    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
}
