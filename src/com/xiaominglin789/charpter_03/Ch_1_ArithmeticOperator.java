package com.xiaominglin789.charpter_03;

public class Ch_1_ArithmeticOperator {
  public static void main(String[] args) {
    /**
    算术运算符：+ , - , * , / , % , ++ , --
     */
    System.out.println(10 / 4); // 10(int) / 4(int) = 2(int)
    System.out.println(10.0 / 4); // 10.0(double) / 4(double) = 2.5(double)

    double dou = 10 / 4;
    System.out.println(dou); // 10(int) / 4(int) = 2(int) =赋值给=> double = 2.0(double)

    // `%`: 取模、取余
    // `%`: 在计算机的本质: a % b = a - (a / b * b)
    System.out.println(10 % 3); // 10 - 10/3 * 3 = 10 - (3 * 3) = 1
    System.out.println(-10 % 3); // (-10) - (-10)/3 * 3 = (-10) - (-3 * 3) = -1
    System.out.println(10 % -3); // 10 - 10 /(-3) * (-3) = 10 - (-3 * -3) = 1
    System.out.println(-10 % -3); // (-10) - (-10)/(-3) * (-3) = (-10) - (3 * -3) = -1

    /**
    `++` 或 `--` 单独使用
      - 前`i++` 与 后`++i` => i = i + 1 => 都是自增
      - 前`i--` 与 后`--i` => i = i - 1 => 都是自减
     */
    int id = 0;
    ++id; // id = id + 1 = 0 + 1 = 1
    id++; // id = id + 1 = 1 + 1 = 2

    /**
    `++` 或 `--` 作为表达式使用(临时变量)
      - 前`++` => `++i` => 先自增后赋值
      - 后`++` => `i++` => 先赋值后自增
     */
    int j = 8;
    int k = j++; // temp=j=8; j++ => j=8+1=9; k=temp=8
    System.out.println("k=" + k + ",j=" + j);
    
    int j1 = 8;
    int k1 = ++j1; // j1=j1+1=9;temp=j1=9; k1=temp=9
    System.out.println("k1=" + k1 + ",j1=" + j1);

    /**
    题目一:
    int d = 1;
    d = d++;
     */
    int d = 1; // d=1
    d = d++; // temp=1; d++ => d=1+1=2; d=temp=1
    System.out.println(d); // 1

    /**
    题目二:
    int e = 1;
    e = ++e;
     */
    int e = 1;
    e = ++e; // ++e => e=1+1=2; temp=e=2; e = temp=2
    System.out.println(e); // 2

    /**
    题目三：
     */
    int i1 = 10;
    int i2 = 20;
    int i = i1++; // temp=i1=10; i1=i1 + 1=11; k=temp=10
    System.out.println("i=" + i); // 10
    System.out.println("i1=" + i1); // 11

    i = --i2; // i2=i2 - 1=19; temp=i2=19; i=temp=19
    System.out.println("i=" + i); // 19
    System.out.println("i2=" + i2); // 19

    /**
    题目四：
      1.假如还有59天放假,问:还有多少个星期零多少天放假？
        - 一个星期7天
        - 59天有多个星期，59 / 7 = 8...3
      2.定义一个变量存华氏温度（234.5），华氏温度转换摄氏温度的公式: 5/9*(华氏温度-100),
        求出华氏温度对应的摄氏温度。
        - 定义一个变量保存 华氏温度
        - 根据关系公式,进行运算
        - 用一个变量保存运算结果
     */
    int day = 59;
    int week = day / 7; // 59 / 7 = 8
    int date = day % 7; // 59 % 7 = 3
    System.out.println("59天 合算 " + week + " 个星期零 " + date + " 天");

    double hua = 234.5;
    double she = 5.0 / 9 * (hua - 100); // 5/9=0
    System.out.println("华氏温度: " + hua + " 对应的摄氏温度: " + she);
  }
}