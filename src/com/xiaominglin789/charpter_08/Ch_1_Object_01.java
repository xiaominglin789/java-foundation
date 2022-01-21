public class Ch_1_Object_01 {
  public static void main(String[] args) {
    /**
    需求:
      小明有2只猫,一只叫小花3岁白色，另一只叫泡泡1岁橘色、
      输入猫的名字,显示猫的信息,找不到则显示没有这只猫.
      - 传统-定义单独变量： 定义2只猫的信息虽然可以，但是这样定义变量非常繁琐、如果要添加猫的爱好? 不好维护
      - 传统-数组: 存放一只猫的信息,虽然可以,但是无法体验变量的类型了。
        - 不能体现猫的行为

      - 不利于数据的管理,效率低
     */

    // 数组不能描述猫的行为
    String[] catArr1 = {"小花", "3", "白色"};
    String[] catArr2 = {"泡泡", "1", "橘色"};

    // 用Cat类的实例,表示小明的2只猫
    Cat cat1 = new Cat();
    cat1.name = "小花";
    cat1.age = 3;
    cat1.color = "白色";
    System.out.println("第一只猫: " + cat1.name + ", " + cat1.age + " 岁, 花色: " + cat1.color);

    Cat cat2 = new Cat();
    cat2.name = "泡泡";
    cat2.age = 1;
    cat2.color = "橘色";
    System.out.println("第二只猫: " + cat2.name + ", " + cat2.age + " 岁, 花色: " + cat2.color);
  }
}

/** 猫类 */
class Cat {
  public String name;  // 猫名
  public int age;      // 猫的年龄
  public String color; // 猫的花色
}