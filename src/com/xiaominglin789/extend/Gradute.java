package com.xiaominglin789.extend;

public class Gradute extends Student{
    public Gradute() {
    }

    public Gradute(String name, int age) {
        super(name, age);
    }

    @Override
    public void testing() {
        System.out.println("大学生：" + this.getName() + " 正在考大学数学...");
    }
}
