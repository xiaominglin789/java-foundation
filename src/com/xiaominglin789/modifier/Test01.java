package com.xiaominglin789.modifier;

class Test01 {
    int n1 = 100;
    public int n2 = 101;
    protected int n3 = 102;
    private int n4 = 103;

    public void m() {
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
    }

    protected void child() {
        System.out.println("child method");
    }

    private void priv() {
        System.out.println("private method");
    }
}
