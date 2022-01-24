package com.xiaominglin789.charpter_10;

public class Ch_5_Exercise03 {
  public static void main(String[] args) {
    /**
    题目十:
      在测试方法中,调用method方法,代码如下: 
        编译正确，试下厨method的定义形式,
        调用语句是: System.out.println(method(method(10.0,20.0), 100));
     */
    System.out.println(method(method(10.0,20.0), 100));

    /**
    题目十一:
      创建一个 Employee类,属性有: 名字、性别、年龄、职位、薪水。提供3个构造方法，
      可以初始化: （1）名字、性别、年龄、职位、薪水， （2）姓名、性别、年龄，（3）职位、薪水。
     */
    Employee emp1 = new Employee("小明", '男', 28, "java开发工程师", 12000);
    emp1.info();
    Employee emp2 = new Employee("小明", '男', 28);
    emp2.info();
    Employee emp3 = new Employee("java开发工程师", 12000);
    emp3.info();
  }

  public static double method(double n1, double n2) {
    return n1 + n2;
  }
}

class Employee {
  private String name;
  private char gender;
  private int age;
  private String job;
  private double money;

  public Employee(String name, char gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public Employee(String job, double money) {
    this.job = job;
    this.money = money;
  }

  public Employee(String name, char gender, int age, String job, double money) {
    this(name, gender, age);

    this.job = job;
    this.money = money;
  }

  public void info() {
    System.out.println("name:" + name + ",gender:" + gender + ",age:" + age
      + ",job:" + job + ",money:" + money);
  }
}
