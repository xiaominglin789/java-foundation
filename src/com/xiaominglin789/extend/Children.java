package com.xiaominglin789.extend;

public class Children extends Base {
    public Children() {
        // 第一行默认会有: super(); // 默认调用基类的构造器
        System.out.println("Children 无参构造器 被调用");
    }

    public Children(int n1) {
        super(n1);
        System.out.println("Children 有参构造器 被调用");
    }

    public void test() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        // System.out.println(n4); 不能直接访问私有变量
        // 但是可以使用基类提供的公开方法访问
        System.out.println("getN4() = " + getN4());

        test100();
        test200();
        test300();

        // test400(); // 不能直接调用私有方法
        // 但是可以使用基类提供的间接方法调用私有方法
        callTest400();
    }
}
