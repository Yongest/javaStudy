package com.itheima_02;

public class Student {
    private  String name;
    private int age;
   public Student(){ }

   public Student(String name,int age){
       this.name = name;
       this.age = age;
   }

   public void setName(String name){
       this.name = name;
   }
//   alt insert 键  快捷创建构造函数。

   public String getName(){
       return  name;
   }

   public int getAge(){
       return  age;
   }

   public  void setAge(int age){
       this.age = age;
   }

}
