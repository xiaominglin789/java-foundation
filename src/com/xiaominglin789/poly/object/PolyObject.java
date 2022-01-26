package com.xiaominglin789.poly.object;

public class PolyObject {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.cry(); // 执行时,看运行类型: Dog

        dog = new Cat();
        dog.cry(); // 执行时,看运行类型: Cat
    }
}

class Animal {
    public void cry() {
        System.out.println("动物叫...");
    }
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("小狗 汪汪叫...");
    }
}

class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("小猫 喵喵叫...");
    }
}
