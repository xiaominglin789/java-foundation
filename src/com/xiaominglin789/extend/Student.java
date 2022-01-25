package com.xiaominglin789.extend;

public class Student {
    private String name;
    private int age;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void testing() {

    }

    public void showInfo() {
        System.out.println("学生名 = " + name + ",年龄 = " + age + ",成绩 = " + score);
    }
}
