package com.xiaominglin789.charpter_10;

public class Ch_3_This {
  public static void main(String[] args) {
    Cat cat = new Cat("小花", 2);
    cat.info(); // name=null,age=0
    System.out.println();

    Cat cat2 = new Cat(2, "小花");
    cat2.info(); // name=小花,age=2
  }
}

class Cat {
  String name;
  int age;

  /**
  原想着:
    name(成员变量) = name(形参)
    age(成员变量) = age(形参)
  但是由于 变量作用域的就近原则 实际上是:
    name(形参) = name(形参)
    age(形参) = age(形参)
  不会改变成员变量的值
  */
  public Cat(String name, int age) {
    System.out.println("this地址:" + this.hashCode());
    name = name;
    age = age;
  }

  /**
  这里应该用 this 来代表当前对象
    当前对象.name = 形参name;
    当前对象.age = 形参age
   */
  public Cat(int age, String name) {
    System.out.println("this地址:" + this.hashCode());

    this.name = name;
    this.age = age;
  }

  public void info() {
    System.out.println("name=" + name + ",age=" + age);
  }
}