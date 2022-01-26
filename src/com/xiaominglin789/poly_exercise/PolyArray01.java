package com.xiaominglin789.poly_exercise;

public class PolyArray01 {
    public static void main(String[] args) {
        // 创建2个Student, 2个Teacher， 调用它们的say方法
        Person[] persons = new Person[5];
        persons[0] = new Student("小明", 12, 78);
        persons[1] = new Student("小敏", 12, 100);
        persons[2] = new Teacher("张老师", 27, 10000);
        persons[3] = new Teacher("牛老师", 28, 11000);
        persons[4] = new Person("牛牛", 12);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            // 类型判断
            if (persons[i] instanceof Student) {
                // 向下转型
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                // 向下转型
                ((Teacher) persons[i]).teach();
            } else {
                // 其他类型
            }
        }
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return "name:" + name + ",age:" + age;
    }
}

class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + ",score:" + score;
    }

    public void study() {
        System.out.println("学生: " + this.getName() + "正在学习...");
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + ",salary:" + salary;
    }

    public void teach() {
        System.out.println("老师: " + this.getName() + "正在教书...");
    }
}
