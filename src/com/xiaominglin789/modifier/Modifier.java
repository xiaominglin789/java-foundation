package com.xiaominglin789.modifier;

public class Modifier {
    public static void main(String[] args) {
        new Test01().m();

        Test01 t1 = new Test01();
        t1.child();
        // t1.priv();
        System.out.println("t1.n1 = " + t1.n1);
        System.out.println("t1.n2 = " + t1.n2);
        System.out.println("t1.n3 = " + t1.n3);
        // System.out.println("t1.n4 = " + t1.n4);
    }
}

