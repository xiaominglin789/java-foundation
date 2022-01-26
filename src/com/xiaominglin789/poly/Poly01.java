package com.xiaominglin789.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("哈利");
        // 主人喂狗
        Dog dog = new Dog("哈士奇");
        Bone bone = new Bone("大棒骨");
        master.wei(dog, bone);
        // 主人喂猫
        Fish fish = new Fish("黄花鱼");
        Cat cat = new Cat("小花猫");
        master.wei(cat, fish);
        // 主人喂猪
        Rice rice = new Rice("米饭");
        Pig pig = new Pig("佩奇");
        master.wei(pig, rice);
    }
}
