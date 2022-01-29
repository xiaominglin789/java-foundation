package com.xiaominglin789.project01.homework;

public class Exercise03 {
    public static void main(String[] args) {
        /**
         * 题目四: 员工工资核算查看
         *  公司员工: 部门经理、普通员工
         *  1.经理工资 = 1000 + 单日工资 * 天数 * 级别(1.2)
         *  2.普通员工工资 = 单日工资 * 天数 * 级别(1.0)
         *  员工基本信息: name、单日工资、工作天数
         *  打印员工的工资情况
         */
        Worker worker = new Worker("张三", 200, 27);
        worker.printSalery();

        Manager manager = new Manager("王五", 300, 24);
        manager.setBonus(3200); // 设置奖金 8640 + 3200 = 11840
        manager.printSalery();
    }
}

class Worker extends Employee {
    public Worker(String name, double daySal, int workDay) {
        super(name, daySal, workDay);
    }
}

class Manager extends Employee {
    private double bonus; // 奖金

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double daySal, int workDay) {
        super(name, daySal, workDay, 1.2);
    }

    public double getSalary() {
        return getWorkDay() * getDaySal() * getLevel() + getBonus();
    }

    @Override
    public void printSalery() {
        System.out.println("姓名: " + getName() + " 日工资: " + getDaySal()
                + " 工作天数: " + getWorkDay() + " 工资: " + getSalary());
    }
}

class Employee {
    private String name; // name
    private double daySal; // 单日工资
    public int workDay; // 工作天数
    public double level; // 级别

    public Employee(String name, double daySal, int workDay) {
        this(name, daySal, workDay, 1.0);
    }

    public Employee(String name, double daySal, int workDay, double level) {
        this.name = name;
        this.daySal = daySal;
        this.workDay = workDay;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getSalary() {
        return getWorkDay() * getDaySal() * getLevel();
    }

    /**
     * 打印工资
     */
    public void printSalery() {
        System.out.println("姓名: " + getName() + " 日工资: " + getDaySal()
                + " 工作天数: " + getWorkDay() + " 工资: " + getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", daySal=" + daySal +
                ", workDay=" + workDay +
                ", level=" + level +
                '}';
    }
}
