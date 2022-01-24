package com.xiaominglin789.charpter_10;

public class Ch_5_Exercise02 {
  public static void main(String[] args) {
    /**
    题目五：
      定义一个圆类, 定义属性: 半径. 提供显示圆周长的方法，提供显示圆面积的方法
     */
    Circular cir = new Circular(10);
    cir.getPerimeter();
    cir.getArea();

    /**
    题目六:
      创建Cale类,实现 加 减 乘 除、
     */
    Cale cal = new Cale();
    cal.plus(15, 53);
    cal.reduce(32, 48);
    cal.ride(31, 17);
    cal.except(67, 15);

    /**
    题目七:
      设计一个Cat类，有名字、颜色、年龄,定义一个show方法显示其属性信息
     */
    Cat1 cat = new Cat1("小花", "橘色", 3);
    cat.show();

    /**
    题目八:
      下面一段代码的运行结果:（）
    
    public class Test {
      int count = 9;

      public void count1() {
        count = 10;
        System.out.println("count1 = " + count);
      }

      public void count2() {
        System.out.println("count2 = " + count++);
      }

      public static void main(String[] args) {
        // new Test() => 产生一个匿名对象,只能使用一次
        new Test().count1(); // 10
        Test t1 = new Test();
        t1.count2(); // 9
        t1.count2(); // 10
      }
    }
     */

    /**
    题目九:
      下面代码的运行结果是: ()
      class Demo {
        int i = 100;
        
        public void m() {
          int j = i++;
          System.out.println("i=" + i); // i=101
          System.out.println("j=" + j); // j=100
        }
      }
      
      // 运行
      ...static void main(String[] args) {
          Demo d1 = new Demo();
          Demo d2 = d1;
          d2.m();
          System.out.println(d1.i); // 101
          System.out.println(d2.i); // 101
        }
     */
  }
}

class Circular {
  private double redius;
  private static double PI = 3.14;

  public Circular(double redius) {
    this.redius = redius;
  }

  public double getPerimeter() {
    double perimeter = 2 * PI * this.redius;
    System.out.println("圆的半径: " + this.redius + " ,周长: " + perimeter);
    return perimeter;
  }

  public double getArea() {
    double area = PI * this.redius * this.redius;
    System.out.println("圆的半径: " + this.redius + " ,面积: " + area);
    return area;
  }
}

class Cale {
  /** 加 */
  public int plus(int operand1, int operand2) {
    int res = operand1 + operand2;
    System.out.println(operand1 + " + " + operand2 + " = " + res);
    return res;
  }

  /** 减 */
  public int reduce(int operand1, int operand2) {
    int res = operand1 - operand2;
    System.out.println(operand1 + " - " + operand2 + " = " + res);
    return res;
  }

  /** 乘 */
  public int ride(int operand1, int operand2) {
    int res = operand1 * operand2;
    System.out.println(operand1 + " x " + operand2 + " = " + res);
    return res;
  }

  /** 除 */
  public double except(int operand1, int operand2) {
    try {
      double res = (1.0 * operand1) / operand2;
      System.out.println(operand1 + " / " + operand2 + " = " + res);
      return res;
    } catch(Exception e) {
      System.out.println("operand2 是被除数, 不能为 0");
      return 0.0;
    }
  }
}

class Cat1 {
  /**
  名字、颜色、年龄,定义一个show方法
   */
  private String name;
  private String color;
  private int age;

  public Cat1(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public void show() {
    System.out.println("name=" + name + ",color=" + color + ",age" + age);
  }
}
