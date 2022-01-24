package com.xiaominglin789.charpter_09;

public class Ch_6_OverLoad {
  public static void main(String[] args) {
    OverLoadMethods m = new OverLoadMethods();
    System.out.println("m.max(11, 32): " + m.max(11, 32));
    System.out.println("m.max(0.8, 1): " + m.max(0.8, 1));
    System.out.println("m.max(1.1, 1.0): " + m.max(1.1, 1.0));
    System.out.println("m.max(6.6, 3.4, 7): " + m.max(6.6, 3.4, 7));
  }
}

class OverLoadMethods {
  public int max(int n1, int n2) {
    return n1 > n2 ? n1 : n2;
  }

  public double max(double n1, double n2) {
    return n1 > n2 ? n1 : n2;
  }

  public double max(double n1, int n2) {
    // System.out.println("形参: double, int");
    return n1 > n2 ? n1 : n2;
  }

  public double max(double n1, double n2, double n3) {
    return n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
  }
}