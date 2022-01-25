package com.xiaominglin789.extend;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("Base无参构造器 被调用");
    }

    public Base(int n1) {
        System.out.println("Base-有参构造器 被调用");
    }

    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("base.test100() public");
    }

    protected void test200() {
        System.out.println("base.test200() protected");
    }

    void test300() {
        System.out.println("base.test300() 默认修饰符");
    }

    private void test400() {
        System.out.println("base.test400() private");
    }

    /**
     * 对外提供-间接调用私有方法的test400的方法
     */
    public void callTest400() {
        test400();
    }
}
