package com.xiaominglin789.poly_exercise;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2000);
        Manager milan = new Manager("米兰", 8000, 15000);

        showEmployee(tom);
        showEmployee(milan);

        testWork(tom);
        testWork(milan);
    }

    // 查看员工的年薪
    public static void showEmployee(Employee e) {
        System.out.println(e.getName() + " 年薪: " + e.getYearSalary());
    }

    // 员工干活
    public static void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {}
    }
}

/**
 * 员工类
 */
class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * 年工资
     * @return
     */
    public double getYearSalary() {
        return 12 * salary;
    }
}

/**
 * 经理类
 */
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println(this.getName() + " 正在画大饼...");
    }

    @Override
    public double getYearSalary() {
        return super.getYearSalary() + bonus;
    }
}

/**
 * 工人类
 */
class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(this.getName() + " 正在工作...");
    }

    @Override
    public double getYearSalary() {
        return super.getYearSalary();
    }
}
