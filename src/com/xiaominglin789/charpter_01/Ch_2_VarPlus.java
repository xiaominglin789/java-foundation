package com.xiaominglin789.charpter_01;

public class Ch_2_VarPlus {
  public static void main(String[] args) {
    /**
    `+`号的使用
      - 当 `+` 左右两边都是数值类型时, 则做 加法运算
      - 当 `+` 左右两边有一方为字符串, 则做 拼接运算
     */
    System.out.println(100 + 98); // 198
    System.out.println("100" + 98); // "10098"
    System.out.println(100 + 3 + " hello"); // "103 hello"
    System.out.println("hello " + 100 + 3); // "hello 1003"
  }
}