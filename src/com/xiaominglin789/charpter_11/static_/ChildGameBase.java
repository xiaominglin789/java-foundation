package com.xiaominglin789.charpter_11.static_;

public class ChildGameBase {
    public static void main(String[] args) {
        Children child = new Children("小明");
        child.join();

        Children child2 = new Children("小红");
        child2.join();

        Children child3 = new Children("小蓝");
        child3.join();

        System.out.println("一共有 " + Children.count + " 个小孩在玩.");
        System.out.println("child3.count = " + child3.count);
        System.out.println("child2.count = " + child2.count);
        System.out.println("child.count = " + child.count);
    }
}

class Children extends Child {
    public static int count;

    public Children(String name) {
        super(name);
    }

    @Override
    public void join() {
        super.join();
        count++;
    }
}

class Child {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入堆雪人游戏...");
    }
}
