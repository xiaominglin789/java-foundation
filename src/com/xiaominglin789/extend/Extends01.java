package com.xiaominglin789.extend;

public class Extends01 {
    public static void main(String[] args) {
        Gradute student1 = new Gradute("小明", 19);
        // student1.setName("小明");
        // student1.setAge(19);
        student1.testing();
        student1.setScore(66);
        student1.showInfo();

        Pupil student2 = new Pupil();
        student2.setName("王二狗");
        student2.setAge(5);
        student2.testing();
        student2.setScore(83);
        student2.showInfo();
    }
}
