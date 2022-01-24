package com.xiaominglin789.charpter_03;

public class Ch_2_RelationalOperator {
  public static void main(String[] args) {
    int g1 = 10;
    int g2 = 20;

    System.out.println(g1 > g2);  // false
    System.out.println(g1 >= g2); // false
    System.out.println(g1 < g2);  // true
    System.out.println(g1 <= g2); // true
    System.out.println(g1 != g2); // true
    System.out.println(g1 == g2); // false

    class A {}
    class B {}
    A test = new A();
    System.out.println(test instanceof A); // true
    // System.out.println(test instanceof B); // 错误: 不兼容的类型: A无法转换为B
  }
}