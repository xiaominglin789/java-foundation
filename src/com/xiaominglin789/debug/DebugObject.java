package com.xiaominglin789.debug;

public class DebugObject {
    public static void main(String[] args) {
        // 断点调试: 对象创建的过程: Alt + Shift + F7
        // 对象创建的流程:
        //  - 1.加载 Person 类信息
        //  - 2.初始化: 1.默认初始化 -> 2.显示初始化 -> 3.构造器初始化
        //  - 3.返回对象地址
        Person person = new Person("八戒", 28);
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
