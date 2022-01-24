public class Ch_9_VarScope {
  public static void main(String[] args) {
    Cat mm = new Cat();
    // 成员变量有默认
    System.out.println("成员变量默认值: name = " + mm.name);
    System.out.println("成员变量默认值 age = " + mm.age);
    mm.cry();
  }
}

class Cat {
  public String name;
  public int age;

  {
    // 这个name的作用域在这个静态代码块中
    String name = "static";
    System.out.println("代码块的name = " + name);
  }

  public void cry() {
    // 这里的name 实际是: this.name
    System.out.println("全局变量name 在cry中使用 = " + name);

    // String fish; // Ch_9_VarScope.java:25: 错误: 可能尚未初始化变量fish
    String fish = "鱼";
    System.out.println("局部变量fish 在cry中使用 = " + fish);

    String name = "就近原则的name";
    System.out.println("这个name是全局的还是局部的 name = " + name);
  }
}
