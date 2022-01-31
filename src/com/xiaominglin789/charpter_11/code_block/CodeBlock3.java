package com.xiaominglin789.charpter_11.code_block;

public class CodeBlock3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        /**
         * 输出: Animal.n1初始化-> 4 -> Cat.n2初始化 -> 1 -> 5 -> 6 -> 2-> 3
         */
    }
}

class Cat extends Animal {
    private static int n2 = getN2();

    private static int getN2() {
        System.out.println("Cat.n2初始化");
        return 99;
    }

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public Cat() {
        // super()
        // 本类的普通代码块
        System.out.println("3");
    }
}

class Animal {
    private static int n1 = getN1();

    private static int getN1() {
        System.out.println("Animal.n1初始化");
        return 11;
    }

    static {
        System.out.println("4");
    }

    {
        System.out.println("5");
    }

    public Animal() {
        // super()
        // 本类的普通代码块
        System.out.println("6");
    }
}
