package com.xiaominglin789.poly.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.count); // 99, 看编译类型 Child
        child.display(); // count=99, 看运行类型 Child

        Base base = child;
        System.out.println(base == child); // true, 指向同一个Child对象
        System.out.println(base.count); // 10， 看编译类型 Child
        base.display(); // count=99, 看运行类型 Child
    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println("count=" + count);
    }
}

class Child extends Base {
    int count = 99;

    /** 重写了 */
    public void display() {
        System.out.println("count=" + count);
    }
}
