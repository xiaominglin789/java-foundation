package com.xiaominglin789.project01.homework5;

public class Person {
    private String name;
    private String job;
    private char gender;
    private int age;
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

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

    public Person(String name, String job, char gender, int age, String hobby) {
        this.name = name;
        this.job = job;
        this.gender = gender;
        this.age = age;
        this.hobby = hobby;
    }

    public String play() {
        return name + "的爱好: " + hobby;
    }

    public String info() {
        return job  + "\n姓名: " + name + "\n性别: " + gender + "\n年龄: " + age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
