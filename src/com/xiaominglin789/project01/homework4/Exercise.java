package com.xiaominglin789.project01.homework4;

import java.util.Objects;

public class Exercise {
    public static void main(String[] args) {
        /**
         * 题目:
         * 编写医生类: Doctor{name, age, job, gender, sal}
         * 重写equals方法，用于判断对象的内容是否相同
         */
        Doctor doctor = new Doctor("jeck", "牙医", '男', 32, 20000);
        Doctor doctor2 = new Doctor("jeck", "牙医", '男', 32, 20000);
        System.out.println(doctor.equals(doctor2));

        Doctor doctor3 = new Doctor("johnny", "牙医", '男', 32, 20000);
        System.out.println(doctor.equals(doctor3));

        /**
         * 说说: == 与 equals的区别
         * ==:
         *   - 比较运算符
         *   - 既可以比较基本数据类型、也可以比较引用类型
         *   - 基本数据类型比较 值 是否相等
         *   - 引用类型比较 值 地址是否相等
         * equals:
         *   - 是Object类的方法, java类都可以使用equals方法
         *   - 只能比较引用类型
         *   - 默认比较对象是否是同一个对象。但是子类往往重写了该方法，比如：
         *      - String.equals: 先判断是否为同一对象,不是且也是String类型,
         *          再比较字符的长度，长度如果一样,再每一个字符是否都相同。
         */


        /**
         * 什么是多态？多态的体现有哪些
         * 多态指的是 方法 或对象 具有多种形态。建立在封装和继承之上。
         * 方法的多态体现: 方法的重载、方法的重写
         * 对象的多态体现:
         *    对象的编译类型和运行类型可以不一样。
         *    编译类型在定义时就确定了
         *    运行类型是可以变化的，可以通过 Object.getClass()获取对象的运行类型。
         *  exp:
         *  print(Person person);
         *  Person p1 = new 子类(); // 向上转型
         *  Person p2 = new 子类2();
         *  ((子类) p1).子类的特有方法 // 向下转型
         *  print(p1);
         *  print(p2);
         *
         * java的动态绑定机制是什么
         *  - 当调用对象的方法时, 该方法会和对象的运行类型绑定。
         *    - 从运行类型的方法开始查找方法
         *    - 找不到再往父类找。
         *  - 当调用对象的属性时, 没有动态绑定机制,哪里声明,那里使用。
         */
    }
}

class Doctor {
    private String name;
    private String job;
    private char gender;
    private int age;
    private double sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Doctor(String name, String job, char gender, int age, double sal) {
        this.name = name;
        this.job = job;
        this.gender = gender;
        this.age = age;
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Doctor) {
            Doctor doc = (Doctor) obj;
            return doc.name.equals(name) && doc.age == age
                    && doc.gender == gender && doc.job.equals(job)
                    && doc.sal == sal;
        }

        return false;
    }
}
