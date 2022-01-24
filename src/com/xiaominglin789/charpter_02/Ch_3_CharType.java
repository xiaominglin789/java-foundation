package com.xiaominglin789.charpter_02;

public class Ch_3_CharType {
  public static void main(String[] args) {
    /**
    char类型:
      - char[2]
    char细节:
      - 1.字符常量用单引号:`''` 括起来, 如: 'c'、'锅'、'6'
      - 2.字符中可以使用转义字符`\`将其后的字符转变成特殊字符型常量
        + char c3 = '\n'; // '\n'表示换行符
      - 3.char的本质是一个整数,输出时,是`unicode`码对应的字符
      - 4.可以直接给char赋一个整数,输出时,会输出整数对应的unicode码对应的字符
      - 5.char可以进行运算, 相当于一个整数。
     */
    char c1 = 'c';
    char c2 = '中';
    char c3 = '6';
    System.out.println(c1); // c
    System.out.println(c2); // 中
    System.out.println(c3); // 6

    char c4 = 103;
    System.out.println(c4); // g

    char c5 = '锅';
    System.out.println((int)c5); // 38149

    char c6 = 'a';
    System.out.println(c6 + 99); // 196, 因为:'a'=>97 97+99=196

    char c7 = 97;
    if (c6 == c7) {
      System.out.println("c6 == c7 ? true"); // 输出 c6 == c7 ? true
    }

  }
}