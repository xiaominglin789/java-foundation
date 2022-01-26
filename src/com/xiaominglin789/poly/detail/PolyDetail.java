package com.xiaominglin789.poly.detail;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        // 编译阶段,能调用哪些成员,有编译类型来决定的
        // animal.run(); // 多态默认向上转型
        animal.eat();

        // 多态的向下转型,引用的强转
        // 编译类型Cat,运行类型Cat
        // 要求`父类的引用`必须指向的是`当前目标类型`的`对象`。
        // cat 和 animal指向同一个Cat对象了。
        Cat cat = (Cat) animal;
        cat.run();
        // ((Cat) animal).run();
    }
}

class Animal {
    public void eat() {
        System.out.println("吃");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void run() {
        System.out.println("猫跑起来...");
    }
}
