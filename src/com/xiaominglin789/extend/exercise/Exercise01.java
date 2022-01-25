package com.xiaominglin789.extend.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        // 将输出什么?
        new B(); // 1.a  2.B name = abc 3.B
    }
}

class A {
    A() {
        System.out.println("a");
    }
    A(String a) {
        System.out.println("A = " + a);
    }
}

class B extends A {
    B() {
        // 不会有 super()
        this("abc");
        System.out.println("B");
    }
    B(String name) {
        // 隐藏了个 super()
        super();
        System.out.println("B name = " + name);
    }
}
