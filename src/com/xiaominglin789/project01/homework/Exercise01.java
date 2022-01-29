package com.xiaominglin789.project01.homework;

public class Exercise01 {
    public static void main(String[] args) {
        /**
         * 题目一: 定义一个Person类(name,age,job)，初始化Person对象数组，创建3个person
         * 按照它们的age从大到小排序。(冒泡排序)
         */
        Person person = new Person("小学生", 12, "python开发工程师");
        Person person1 = new Person("大学生", 23, "java开发工程师");
        Person person2 = new Person("初中学生", 16, "php开发工程师");
        Person[] arr = new Person[]{person, person1, person2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("排序后：");
        for (int i = 0; i < arr.length-1; i++) {
            boolean change = false;
            for (int j=0; j < arr.length-1 -i; j++) {
                // 根据年龄，从  大 到 小 排序
                if (arr[j].getAge() < arr[j+1].getAge()) {
                    Person temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    change = true;
                }
                // 根据年龄，从 小 到 大排序
//                if (arr[j].getAge() > arr[j+1].getAge()) {
//                    Person temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    change = true;
//                }
                // 根据名字长度，从  大 到 小 排序
//                if (arr[j].getName().length() < arr[j+1].getName().length()) {
//                    Person temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    change = true;
//                }
            }
            if (!change) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        /**
         * 题目二: 写出四种访问修饰符  和 各自的访问权限
         * public 本类、同包、子类、不同包都可以访问
         * protected 本类、同包、子类可以访问，不同包不能访问
         * 默认不写 本类、同包可以访问, 子类、不同包不能访问
         * private 私有的.只能在本类内使用。同包、子类、不同包都不能访问
         */
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
