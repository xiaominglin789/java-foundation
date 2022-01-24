package com.xiaominglin789.charpter_10;

public class Ch_2_ConstructorExercize {
  public static void main(String[] args) {
    Person1 p = new Person1(28, "小明");
    Person1 p2 = p;
  }
}

class Person1 {
  public String name;
  public int age;

  public Person1(int pAge, String pName) {
    age = pAge;
    name = pName;
  }
}