public class Ch_1_Constructor {
  public static void main(String[] args) {
    Person person = new Person("米兰", 18);
    System.out.println("name = " + person.name + " , age = " + person.age);

    Person milan = new Person("小米兰");
    System.out.println("name = " + milan.name + " , age = " + milan.age);

    // javap -v Dog.class
    // Compiled from "Ch_1_Constructor.java"
    // class Dog {
    //   Dog();
    // }
    Dog d = new Dog();
  }
}

class Person {
  public String name;
  public int age;

  public Person(String pName) {
    System.out.println("Person(String pName) 被调用");
    name = pName;
  }

  public Person(String pName, int pAge) {
    System.out.println("Person(String pName, int pAge) 被调用");
    name = pName;
    age = pAge;
  }
}

class Dog {}