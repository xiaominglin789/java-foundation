public class Ch_4_ThisDetail {
  public static void main(String[] args) {
    Pig p = new Pig(); // name=佩奇

    Pig p1 = new Pig("熊二");
    Pig p2 = new Pig("熊二");
    System.out.println("p1.name= " + p1.name);
    System.out.println("p2.name= " + p2.name);
    System.out.println("p1 和 p2 姓名相同吗 ? " + p1.compareTo(p2));
  }
}

class Pig {
  String name;

  public Pig() {
    this("佩奇");
    this.info();
  }

  public Pig(String name) {
    this.name = name;
  }

  private void info() {
    System.out.println("name=" + name);
  }

  public boolean compareTo(Pig pig) {
    return this.name.equals(pig.name);
  }
}