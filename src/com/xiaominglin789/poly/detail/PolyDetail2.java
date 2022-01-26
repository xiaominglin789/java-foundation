package com.xiaominglin789.poly.detail;

public class PolyDetail2 {
    public static void main(String[] args) {
        AA bb = new BB();
        // 对象多态的属性访问: 属性没有重写的说法...
        // 属性访问原则: 只看编译类型。
        // bb的编译类型是: AA, bb.count是去AA类开始找count
        System.out.println("bb = " + bb.count); // 10

        BB cc = (BB) bb;
        // cc的编译类型: BB, 去BB类开始找: count
        System.out.println("cc = " + cc.count); // 99

        /** instanceof 比较是否为 某某类型 或 某某类型的子类类型 */
        AA dd = new BB();
        System.out.println(dd instanceof AA); // true
        System.out.println(dd instanceof BB); // true
        System.out.println(dd instanceof Object); // true

    }
}

class AA {
    public int count = 10;
}

class BB extends AA {
    public int count = 99;
}
