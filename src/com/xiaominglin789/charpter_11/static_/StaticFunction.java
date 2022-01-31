package com.xiaominglin789.charpter_11.static_;

public class StaticFunction {
    public static void main(String[] args) {
        Student student = new Student("小明");
        student.payFee(1200);

        Student student2 = new Student("小兰");
        student2.payFee(900);

        // 查看总学费
        Student.showFee();
    }
}

class Student {
    private String name;
    private static double fee;

    public Student(String name) {
        this.name = name;
    }

    /** 静态方法-交学费 */
    public static void payFee(double fee) {
       Student.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费 = " + Student.fee);
    }
}
