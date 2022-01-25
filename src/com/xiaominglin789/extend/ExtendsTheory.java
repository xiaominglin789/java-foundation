package com.xiaominglin789.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("son.name = " + son.name);
        System.out.println("son.age = " + son.getAge());
        System.out.println("son.hobby = " + son.hobby);
    }
}
// 爷类
class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 35;
}
// 父类
class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}
// 子类
class Son extends Father {
    String name = "大头儿子";
}

