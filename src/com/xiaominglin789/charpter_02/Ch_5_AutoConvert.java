package com.xiaominglin789.charpter_02;

public class Ch_5_AutoConvert {
  public static void main(String[] args) {
    // 自动转换: 精度小转精度大
    int n1 = 'a'; // ok char->int, n1=97
    System.out.println(n1); // 97
    double n2 = n1; // ok int(97)->double, n2=97.0
    System.out.println(n2); // 97.0
    
    int n3 = 10; // ok
    /**
    编译错误:
      n3 + 1.1
      1.1是double, n3 + 1.1 所有都转成最大的类型
      n3值的类型也转成double => 10.0
      10.0 + 1.1 结果是double
      float f1 = double  编译false,因为:大容量的值 无法赋值给 容量小的变量
    */ 
    // float f1 = n3 + 1.1;  // 错误: 不兼容的类型: 从double转换到float可能会有损失
    double d1 = n3 + 1.1;
    System.out.println(d1);

    /**
    当把 `具体的数` 赋值给 `byte`时,
      - 1.系统会先判断 `该数` 是否在 `byte`的取值范围内,
      如果`在取值范围内`就可以赋值
      如果`超过取值范围内`,报错的,无法通过编译
    */ 
    byte b1 = 10; // 编译通过的, byte的范围: -128 ~ 127
    // byte b2 = 128; // 错误: 不兼容的类型: 从int转换到byte可能会有损失

    int n4 = 1;
    /**
    如果是变量赋值,判断类型。则直接看容量大小
    变量 n4 赋值后, 1是的int值了
     */
    // byte b3 = n4; // 错误: 不兼容的类型: 从int转换到byte可能会有损失

    // `byte`、`short` 和 `char` 之间不会发生互相自动转换
    byte b3 = 10;
    // char c1 = b3; // 错误: 不兼容的类型: 从byte转换到char可能会有损失

    char c2 = 'a';
    // byte b4 = c2; // 错误: 不兼容的类型: 从char转换到byte可能会有损失

    byte b5 = 'a'; // 直接将 char数值 赋值是可以的,因为 'a'=>97,97在byte的范围内
    System.out.println(b5);

    // `byte`、`short`、`char`三者可以一起参与计算,在计算时首先转换成`int`类型
    byte b6 = 1;
    short s1 = 1;
    // b6 + s1 => 先将各种类型转成 int, 结果也是 int
    // short s2 = b6 + s1; // 错误: 不兼容的类型: 从int转换到short可能会有损失
    
    int n5 = b6 + s1;
    System.out.println(n5); // 2

    // `boolean`不参与转换
    boolean pass = true;
    // int n7 = pass; // 错误: 不兼容的类型: boolean无法转换为int

    // 自动提示原则: 表达式结果的类型自动提升为 操作数中最大的类型
    byte b7 = 1;
    short s2 = 100;
    int n8 = 2;
    double d2 = 1.1;
    System.out.println(b7 + s2 + n8 + d2); // 104.1 , 计算结果将是 double 类型
  }
}