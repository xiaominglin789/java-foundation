package com.xiaominglin789.debug;

public class DebugDynamicBinding {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.sum());
        System.out.println(a.sum2());
    }
}

class A {
    public int i = 10;

    public int getI() {
        return i;
    }

    public int sum() {
        return getI() + 10;
    }

    public int sum2() {
        return i + 10;
    }
}

class B extends A {
    public int i = 20;

    public int getI() {
        return i;
    }
}