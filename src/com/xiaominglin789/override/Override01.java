package com.xiaominglin789.override;

public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.say();
        dog.yao("猪");
    }
}

class Animal {
    public void say() {
        System.out.println("动物嗷嗷叫...");
    }

    public Object yao(String name) {
        System.out.println("咬到 name = " + name);
        return new Object();
    }
}

class Dog extends Animal {
    public void say() {
        System.out.println("小狗汪汪叫...");
    }

    // String yao(String name) {} 编译报错: 正在尝试分配更低的访问权限; 以前为public
    public String yao(String name) {
        System.out.println("子类重写父类 yao 方法， name = " + name);
        return "";
    }
}