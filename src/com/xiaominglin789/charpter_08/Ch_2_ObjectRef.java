public class Ch_2_ObjectRef {
  public static void main(String[] args) {
    Dog dog = new Dog();
    
    Dog dog2 = dog;
    dog2.name = "二哈";

    System.out.println("名字: " + dog.name);

    dog2 = null;
    System.out.println("名字: " + dog2.name);
  }
}

class Dog {
  public String name = "二狗子";
}