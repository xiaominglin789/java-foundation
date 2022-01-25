package com.xiaominglin789.encap;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("", 0, 10086);
        person.setName("乌龟");
        person.setAge(199);

        System.out.println("person = " + person);
    }
}

class Person {
    /**
     * 设计一个类: 不能随便查看人的年龄，工资等隐私，并对设计的年龄进行合理的验证。
     * 年龄: 1~120岁。 工资不能直接查看。 name长度：2-6个字符之间。
     */
    private String name;
    private int age;
    private double money;

    public Person(String name, int age, double money) {
        // 将set成员变量的方法写在构造器中,避免直接修改成员变量
        this.setName(name);
        this.setAge(age);
        this.setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2 || name.length() > 6) {
            System.out.println("设置的名字不合理，名字长度范围:[2,6]");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("设置的年龄不合理，年龄的合理范围: [1,120], 默认年龄: 18");
            // 设置默认年龄: 18
            this.age = 18;
            return;
        }
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
