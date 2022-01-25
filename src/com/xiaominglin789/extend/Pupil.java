package com.xiaominglin789.extend;

public class Pupil extends Student {
    public Pupil() {
    }

    public Pupil(String name, int age) {
        super(name, age);
    }

    @Override
    public void testing() {
        System.out.println("小学生: " + this.getName() + " 正在考体育...");
    }
}
