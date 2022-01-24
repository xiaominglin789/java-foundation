package com.xiaominglin789.charpter_03;

public class Ch_3_LogicOperator {
  public static void main(String[] args) {
    /**
      - &&(短路与) 
        + 第一个条件为:true, 才会去判断执行后面的条件,全部条件都为:true,结果才为:true。
        + 只要遇到条件为:false,后面的条件都不再判断执行,结果为:false
          - 第一个条件为:false, 后面的条件不再判断执行,最终结果为:false。效率高
      - &(逻辑与) 
        + 所有的条件都要去判断执行，全部条件为:true,结果才为:true,否则为:false。效率低
      - ||(短路或) 
        + 第一个条件为:false, 才会去判断执行后面的条件,全部条件都为:false,最终结果为:false。
        + 只要遇到条件为:true,后面的条件都不再判断执行,结果为:true
          + 第一个条件为:true, 后面的条件不再判断执行,最终结果为:true。效率高
      - |(逻辑或) 
        + 所有的条件都要去判断执行,只要有一个为真,结果就为:true，否则为:false。效率低
     */
    int age = 50;
    if (age > 20 && age < 90) {
      System.out.println("age="+ age + ": 20 < age < 90");
    }
    System.out.println("--------------------------");

    // 50 > 50 false, 不再判断 (f1 = true) 。
    boolean f1 = false;
    if (age > 50 && (f1 = true)) {
      System.out.println("f1=" + f1); // f1=
      System.out.println("age="+ age + ": age > 50 && true");
    } else {
      System.out.println("f1=" + f1); // f1=false
      System.out.println("不满足条件");
    }
    System.out.println("--------------------------");

    // 50 > 50 false,依然回进行判断 (f2 = true)
    // false & true => false, 不满足条件
    boolean f2 = false;
    if (age > 50 & (f2 = true)) {
      System.out.println("f2=" + f2); // f2=
      System.out.println("age="+ age + ": age > 50 & true");
    } else {
      System.out.println("f2=" + f2); // f2=true
      System.out.println("不满足条件");
    }
    System.out.println("--------------------------");

    // 50 > 49 true, 后面不再判断
    // => true, 满足条件
    boolean f3 = false;
    if (age > 49 || (f3 = true)) {
      System.out.println("f3=" + f3); // f3=false
      System.out.println("age="+ age + ": age > 49");
    }
    System.out.println("--------------------------");

    // 50 > 50 false, 继续判断 (f4 = true)
    // false || true => true, 满足条件
    boolean f4 = false;
    if (age > 50 || (f4 = true)) {
      System.out.println("f4=" + f4); // f4=true
      System.out.println("age="+ age + ": age > 50");
    }
    System.out.println("--------------------------");

    // 50 > 50 false,依然要判断 (f6 = true)
    // false | true => true, 满足条件
    boolean f6 = false;
    if (age > 50 | (f6 = true)) {
      System.out.println("f6=" + f6); // f6=true
      System.out.println("age="+ age + ": age > 50");
    }
    System.out.println("--------------------------");

    // 50 > 49 true,依然要判断 (f7 = true)
    // true | true => true, 满足条件
    boolean f7 = false;
    if (age > 50 | (f7 = true)) {
      System.out.println("f7=" + f7); // f7=true
      System.out.println("age="+ age + ": age > 49");
    } 

    /**
    `!`： `取反（非）`
    `^`： `逻辑异或`（`a^b`, `a` 和 `b` 不同,返回 `true`; a 和 b 相同, 则返回 
     */
    boolean isOk = false;
    isOk = !isOk;
    System.out.println(isOk); // true

    boolean a = false;
    boolean b = true;
    System.out.println(a ^ b); // true

    int n1 = 1;
    int n2 = 2;
    System.out.println(n1 ^ n2); // 3 = 0001 ^ 0010 = 0011;

    int n3 = 2;
    System.out.println(n2 ^ n3); // 0 = 0010 ^ 0010 = 0000;
    
  }
}