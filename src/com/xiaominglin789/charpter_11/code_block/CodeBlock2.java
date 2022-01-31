package com.xiaominglin789.charpter_11.code_block;

public class CodeBlock2 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println();

        BB bb = new BB("oppo");
    }
}

class BB {
    public String n2 = getN2();

    {
        System.out.println("普通代码块被执行");
    }

    public BB(String n2) {
        this.n2 = n2;
        System.out.println("构造器被调用");
    }

    public String getN2() {
        System.out.println("getN2被调用");
        return "100";
    }
}

class AA {
    static {
        System.out.println("AA 静态代码块1...");
    }

    private static int n1 = getN1(); // 静态变量初始化

    static {
        System.out.println("AA 静态代码块2....");
    }

    public static int getN1() {
        System.out.println("getN1()被调用...");
        return 99;
    }

    public AA() {
        System.out.println("AA 构造器被执行");
    }
}
