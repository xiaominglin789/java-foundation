package com.xiaominglin789.dynamic_binding;

public class DynamicBinding01 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println("a.sum() = " + a.sum()); // 40, a的类型: B, B有sum方法
        System.out.println("a.sum1() = " + a.sum1()); // 30, a的类型: B B有sum1方法
        System.out.println("--------------------------");

        A1 a1 = new B1();
        // 如果B1类没有sum,往上找父类. `getI()`内部调用方法时,产生动态绑定机制。`getI() + 10` => getI()->去B1内存中找。20(B1的getI()的`i`) + 10 = 30
        System.out.println("a1.sum() = " + a1.sum()); // 30
        // 当调用属性时，没有动态绑定机制，哪里声明，那里使用。`i + 10;` => i=10(i是A1声明的i) + 10 = 20
        System.out.println("a1.sum1() = " + a1.sum1()); // 20
    }
}

class A {
    public int i = 10;

    public int sum() {
        // 当调用对象方法的时候,该方法会和该对象的内存地址/运行类型绑定
        return getI() + 10;
    }

    public int sum1() {
        // 当调用属性时，没有动态绑定机制，哪里声明，那里使用。
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class A1 {
    public int i = 10;

    public int sum() {
        // 如果B1类没有sum,往上找父类. `getI()`内部调用方法时,产生动态绑定机制。`getI() + 10` => getI()->去B1内存中找。20(B1的getI()的`i`) + 10 = 30
        return getI() + 10;
    }

    public int sum1() {
        // 当调用属性时，没有动态绑定机制，哪里声明，那里使用。`i + 10;` => i=10(i是A1声明的i) + 10 = 20
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B1 extends A1 {
    public int i = 20;

    public int getI() {
        System.out.println("B1 getI 被调用...");
        return i;
    }
}