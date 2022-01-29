package com.xiaominglin789.project01.homework;

public class Exercise02 {
    public static void main(String[] args) {
        /**
         * 题目三： 编写老师类
         * 1.属性: name,age,post(职称:默认,老师),salary(基本工资:4800)
         * 2.业务方法: introduce,可以输出教师的信息
         * 3.编写3个子类: 教授类-Professor,副教授类-UnProfessor,讲师类-Lecturer
         *   工资级别: 教授类:1.7  副教授:1.5  讲师:1.1
         * 4.打印3类老师的信息
         */
        Professor professor = new Professor("光头强", 36);
        professor.introduce();
        Professor professor2 = new Professor("李铁男", 39);
        professor2.introduce();
        UnProfessor unProfessor = new UnProfessor("熊大", 32);
        unProfessor.introduce();
        Lecturer lecturer = new Lecturer("熊二", 28);
        lecturer.introduce();
        Teacher teacher = new Teacher("吉吉国王", 23);
        teacher.introduce();
    }
}

class Lecturer extends Teacher {
    public Lecturer(String name, int age) {
        this(name, age, "讲师");
    }

    public Lecturer(String name, int age, String post) {
        super(name, age, post);
        super.setLevel(1.1);
        setSalary(getSalary() * getLevel());
    }
}

class UnProfessor extends Teacher {
    public UnProfessor(String name, int age) {
        this(name, age, "副教授");
    }

    public UnProfessor(String name, int age, String post) {
        super(name, age, post);
        setLevel(1.5);
        setSalary(getSalary() * getLevel());
    }
}

class Professor extends Teacher {
    public Professor(String name, int age) {
        this(name, age, "教授");
    }

    public Professor(String name, int age, String post) {
        super(name, age, post);
        setLevel(1.7);
        setSalary(getSalary() * getLevel());
    }
}

class Teacher {
    private String name; // 名字
    private int age; // 年级
    private String post; // 职称
    private double salary = 4800; // 工资
    private double level= 1; // 工资级别

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        setPost("教师");
    }

    public Teacher(String name, int age, String post) {
        this.name = name;
        this.age = age;
        this.post = post;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println(this.getPost()+"信息: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", level=" + level +
                '}';
    }
}

