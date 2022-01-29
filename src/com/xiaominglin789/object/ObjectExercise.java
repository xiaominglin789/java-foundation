package com.xiaominglin789.object;

public class ObjectExercise {
    public static void main(String[] args) {
        Integer x = new Integer(11);
        x.equals(x); // true

        "xxx".equals("xxx"); // true

        Object o = new Object();
        o.equals(o); // true

        Boolean b = new Boolean(false);
        b.equals(b); // true

        Double d = new Double(1.0);
        d.equals(d); // true

        /**
         * 以下代码输出的什么：
         *  int it = 65;
         *  float f1 = 65.0f;
         *  System.out.println(it == f1); // true 基本数据类型比较,值判断
         *
         *  char c1 = 'A'; char c2 = 12;
         *  System.out.println(c1 == it); // true, 字符的本质是整数, A=>65
         *  System.out.println(c2 == 12); // true, 值比较
         *
         *  String str1 = new String("hello");
         *  String str2 = new String("hello");
         *  System.out.println(str1 == str2); // false, ==引用类型: 比较地址
         *  System.out.println(str1.equals(str2)); // true, equals 根据数据类型的重写equals判断, sting比较每一个字符
         */
        System.out.println("========================");
         int it = 65;
         float f1 = 65.0f;
         System.out.println(it == f1); // true 基本数据类型比较,值判断

         char c1 = 'A'; char c2 = 12;
         System.out.println(c1 == it); // true, 字符的本质是整数, A=>65
         System.out.println(c2 == 12); // 值比较

         String str1 = new String("hello");
         String str2 = new String("hello");
         System.out.println(str1 == str2); // false, ==引用类型: 比较地址
         System.out.println(str1.equals(str2)); // true, equals 根据数据类型的重写equals判断, sting比较每一个字符
    }
}
