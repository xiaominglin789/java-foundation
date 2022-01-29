package com.xiaominglin789.object;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();
        System.out.println("aa.hashCode() = " + aa.hashCode());
        System.out.println("aa2.hashCode() = " + aa2.hashCode());

        AA aa3 = aa;
        System.out.println(aa.hashCode() + " <=> " + aa3.hashCode());
    }
}

class AA {}
