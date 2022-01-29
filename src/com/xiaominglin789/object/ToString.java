package com.xiaominglin789.object;

public class ToString {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o);
        System.out.println("o.toString() = " + o.toString());

        Master master = new Master("金角大王", "吃人", 9999);
        System.out.println(master);
        System.out.println("master.toString() = " + master.toString());
    }
}

class Master {
    private String name;
    private String job;
    private int age;

    public Master(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
