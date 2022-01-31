package com.xiaominglin789.charpter_11.code_block;

public class CodeBlock {
    public static void main(String[] args) {
        Person person = new Person("杰克"); // 创建对象时,先调用类的代码块,后调用类的构造器
        Person person2 = new Person("船长");
        System.out.println("+++++++++++++++++++++++++++++++");

        System.out.println(Human.hobby);
        Human lang = new Human("灰太狼", "涮羊肉");
        Human lang2 = new Human("红太狼", "红烧羊排");
    }
}

class Human {
    public String name;
    public static String hobby;

    // 静态代码块,在类加载时,被调用,也只会被执行一次。
    static {
        hobby = "划水";
        System.out.println("类加载时,被调用: hobby= " + hobby);
    }

    public Human(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
        System.out.println(name + " 爱 " + hobby);
    }
}

class Person {
    public String name;

    {
        name = "代码块设置name=小猪";
        System.out.println("代码块被调用: " + name);
    };

    public Person(String name) {
        System.out.println("name = " + name);
    }
}
