public class Ch_2_ConstructorExercize {
  public static void main(String[] args) {
    Person p = new Person(28, "小明");
    Person p2 = p;
  }
}

class Person {
  public String name;
  public int age;

  public Person(int pAge, String pName) {
    age = pAge;
    name = pName;
  }
}