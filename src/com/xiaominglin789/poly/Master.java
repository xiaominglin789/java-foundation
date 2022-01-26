package com.xiaominglin789.poly;

/**
 * 主人类
 */
public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    /**
     * 多态 - 投食方法
     * @param animal 编译类型Animal,运行类型是实际的子类：Cat/Dog/Pig
     * @param food 编译类型Food,运行类型是实际的子类: Fish/Bone/Rice
     */
    public void wei(Animal animal, Food food) {
        System.out.println("主人-" + name + " 给 " + animal.getName() + " 喂:" + food.getName());
        animal.eat(food.getName());
    }

    /**
     * 如果动物增多、食物，会导致 wei 方法的重载要写很多遍...
     *  - 反复重复拓展wei的重载。
     */
    /** 喂猫 */
//    public void wei(Cat cat, Fish fish) {
//        System.out.println("主人-" + name + " 给 " + cat.getName() + " 喂:" + fish.getName());
//        cat.eat(fish.getName());
//    }

    /** 喂狗 */
//    public void wei(Dog dog, Bone bone) {
//        System.out.println("主人-" + name + " 给 " + dog.getName() + " 喂:" + bone.getName());
//        dog.eat(bone.getName());
//    }

    /** 喂猪 */
//    public void wei(Pig pig, Rice rice) {
//        System.out.println("主人-" + name + " 给 " + pig.getName() + " 喂:" + rice.getName());
//        pig.eat(rice.getName());
//    }
}
