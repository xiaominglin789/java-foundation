package com.xiaominglin789.project01.homework2;

public class Exercise04 {
    public static void main(String[] args) {
        /**
         * 题目五:
         * 打印各种类型的工作者的全年工资
         * 工作者: 工人、农民、教师、科学家
         * 工人、农民 只有基本工资
         * 教师除了基本工资外、还有课酬(元/天)
         * 科学家除了基本工资还有奖金
         */
        Scientist scientist = new Scientist("张三", "科学家", 7200);
        scientist.setMonth(15);
        scientist.setBonus(32000);
        scientist.print();

        Worker worker = new Worker("小明", "工人", 4562);
        worker.print();

        Farmer farmer = new Farmer("小林", "农民", 2875);
        farmer.print();

        Teacher teacher = new Teacher("小黄", "教师", 6800);
        teacher.setClassPay(32);
        teacher.print();
    }
}

class Scientist extends Employee {
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private double bonus;

    public Scientist(String name, String job, double sal) {
        super(name, job, sal);
    }

    @Override
    public double getYearSalary() {
        return super.getYearSalary() + getBonus();
    }
}

class Teacher extends  Employee {
    private double classPay = 16; // 默认课酬 元/天, 每个月最多工作24天
    private int mounthWorkDay = 24;

    public Teacher(String name, String job, double sal) {
        super(name, job, sal);
    }

    public double getClassPay() {
        return classPay;
    }

    public void setClassPay(double classPay) {
        this.classPay = classPay;
    }

    public int getMounthWorkDay() {
        return mounthWorkDay;
    }

    public void setMounthWorkDay(int mounthWorkDay) {
        this.mounthWorkDay = mounthWorkDay;
    }

    @Override
    public double getYearSalary() {
        return super.getYearSalary() + getMonth() * mounthWorkDay * classPay;
    }
}

class Farmer extends Employee {
    public Farmer(String name, String job, double sal) {
        super(name, job, sal);
    }
}

class Worker extends Employee {
    public Worker(String name, String job, double sal) {
        super(name, job, sal);
    }
}

class Employee {
    private String name;
    private String job;
    private double sal;
    private int month = 12;

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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Employee(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    /**
     * 年工资
     * @return
     */
    public double getYearSalary() {
        return this.sal * this.month;
    }

    /**
     * 打印年薪
     */
    public void print() {
        System.out.println("名字: " + getName() + " 工种: " + getJob() + " 年工资: " + getYearSalary());
    }
}

