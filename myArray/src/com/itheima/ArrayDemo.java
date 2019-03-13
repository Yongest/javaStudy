package com.itheima;

public class ArrayDemo {
    public static void main(String[] args) {

//        一，数组动态初始化
        int[] arr  = new int[3];

        /*
        * int : 说明数组中的元素是int类型，
        * [] 说明这是一个数组
        * arr:这是数组的名称
        *
        * new 为数组申请内存空间
        * 3 数组的长度
        * */

        System.out.println(arr);  //[I@43a25848
        System.out.println(arr[0]);  //0
        System.out.println(arr[1]);  //0
        System.out.println(arr[2]);  //0

//        java 中内存分配
//        栈内存：存储局部变量；定义在方法中的变量，例如arr,使用完毕，立即消失
//        堆内存：存储new出来的内容，（实体，对象）
//        数组在初始化时，会为存储空间添加默认值，
        /*
        * 整数：0
        * 浮点数：0.0
        * 布尔：false,
        * 字符：空字符，
        * 引用数据类型：null,
        * 每个new 出来的东西都有一个地址值，
        * 使用完毕会在垃圾回收容器空闲时被回收
        * */


//        二，数组静态初始化
        System.out.println("-----------------------");
        int[] arr3 = {100,200,300,400};
//        System.out.println(arr3[0]);
//        System.out.println(arr3[2]);
//        System.out.println(arr3.length);
        //        三、数组的遍历
        for (int i : arr3) {
            System.out.println(i);
        }

        for (int i = 0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }


//        数组操作两个小问题
//        1.索引越界
//        2.空指针异常，arr = null; arr[0]访问的数组已经不再指向堆内存里面的数据啦，造成空指针异常
//        null  空值，应用类型的默认值，表示不指向任何有效对象。



    }
}
