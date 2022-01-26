package com.xiaominglin789.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("小明", 30);
        person.say();

        Student student = new Student("小敏", 28, 100000, 69);
        student.say();
    }
}

/**
 * 题目:
 *  - 1.编写Person类,包括属性: name、age, say方法返回自我介绍信息
 *  - 2.编写一个Student类, 继承Person类, 增加: id、score属性,定义自己的say方法
 *  - 3.测试2个类的功能
 */
class Person {
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void say() {
        System.out.println("我叫:" + name + ",年龄:" + age);
    }

}

class Student extends Person {
    private int id;
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public void say() {
        super.say();
        System.out.print(",id:" + id + ",分数:" + score + "\n");
    }
}