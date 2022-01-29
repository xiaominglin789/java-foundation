package com.xiaominglin789.project01.homework5;

public class Teacher extends Person {
    private int workAge;

    public Teacher(String name, String job, char gender, int age, String hobby, int workAge) {
        super(name, job, gender, age, hobby);
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workAge=" + workAge +
                '}' + super.toString();
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
    
    public void teach() {
        System.out.println("我承诺,我会认真教课。");
    }

    @Override
    public String info() {
        return super.info() + "\n工龄: " + getWorkAge() + "\n" + play();
    }

    public void print() {
        System.out.println(info());
        teach();
    }
}
