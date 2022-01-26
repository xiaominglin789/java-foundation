package com.xiaominglin789.poly;

/**
 * 动物基类
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(String name) {
        System.out.println(this.name + " 吃 " + name);
    }
}
