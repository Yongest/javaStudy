import  java.util.Scanner;
public class MyMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第2个整数");
        int b = sc.nextInt();
        int num=getMax(a,b);
        System.out.print("最大数是");
        System.out.println(num);

        boolean flag= isEvenNumber(6);
        System.out.println(flag);

//        重载练习
        System.out.println("-------------重载练习-------------");
        System.out.println(compare(10,20));
        System.out.println(compare((short)10,(short) 20));
        System.out.println(compare((byte) 20,(byte) 20));
        System.out.println(compare(20L,20L));
//        数组值改变练习
        System.out.println("-------------数组值改变练习,引用类型值改变-------------");

        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static int getMax(int num1,int num2) {
        if(num1>num2){
           return  num1;
        }else {
            return  num2;
        }
    }

    public static  boolean isEvenNumber(int number){
        if(number%2==0){
            return  true;
        }else {
            return  false;
        }
    }

/*方法定义注意事项：
*  1.public 不能嵌套。
*  2.
* */

/*方法的通用格式
* public static 返回值类型 方法名(参数){
*   方法体
*   return 数据
* }
*
*
* public static 修饰符
*
* 明确返回值类型，没有返回值则使用void
* */

/*
* 方法重载：
* 同一个类中，相同函数名，不同参数、类型不同或数量不同。
* 调用时，看传的参数，传的参数不同，调用不同的方法。
* */

    public static boolean compare(int a,int b){
        System.out.println("int");
        return  a==b;
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return  a==b;
    }
    public static boolean compare(short a,short b){
        System.out.println("short");
        return  a==b;
    }
    public static boolean compare(long a,long b){
        System.out.println("long");
        return  a==b;
    }

    public  static void change(int[] arr){
        arr[0]=200;
    }

}
