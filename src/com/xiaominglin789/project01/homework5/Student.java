package com.xiaominglin789.project01.homework5;

public class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Student(String name, String job, char gender, int age, String hobby, String studentId) {
        super(name, job, gender, age, hobby);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                '}' + super.toString();
    }

    public void study() {
        System.out.println("我承诺,我会好好学习");
    }

    @Override
    public String info() {
        return super.info() + "\n学号: " + getStudentId() + "\n" + play();
    }

    public void print() {
        System.out.println(info());
        study();
    }
}
