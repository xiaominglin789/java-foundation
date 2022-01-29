package com.xiaominglin789.object;

public class Finalize {
    public static void main(String[] args) {
        // Object.finalize
        Car car = new Car("宝马");
        car = null; // 引用断开
        System.gc(); // 主动调用系统回收器
        System.out.println("程序退出...");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁前,操作: " + name);
//        super.finalize();
    }
}
