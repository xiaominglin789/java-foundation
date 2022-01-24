package com.xiaominglin789.charpter_04;

public class Ch_3_Pracctice {
  public static void main(String[] args) {
    // 10(int) / 3(int) = 3(int)
    System.out.println(10 / 3); 
    
    // 10(int) / 5(int) = 2(int)
    System.out.println(10 / 5); 

    // 10 % 2 = 10 - 10/2*2 = 10 - 5*2 = 0
    System.out.println(10 % 2);

    // -10.5 % 3 = -10.5 - (int)(-10.5)/3*3 = -10.5 - (-10 / 3 * 3)
    //  = -10.5 - (-3*3) = -10.5 +9 = -1.5
    System.out.println(-10.5 % 3); // -1.5

    /**
    下列代码的结果
     */
    int i = 66;
    // ++i + i = i=i+1=67;temp=67;i=temp=67;i+i=134
    System.out.println(++i+i); // 134

    /**
    下列语句正确的: c、d
    a.int n1 = (int)"18"; // false, n1=Integer.parseInt("18")
    b.int n2 = 18.0; // false, double 不能自动转 int
    c.double n3 = 3d; // ok,double=>double
    d.double n4 = 8; // ok,int=>double
    e.int i = 48; char ch = i + 1; // i+1=i(int) + 1(int) => int 不能自动转 char
    f.byte b = 19; short s = b + 2; // b+2(int),b值转(int) => 相加得到int, 不能自动转 byte
     */

    char c11 = '中';
    String s11 = c11 + "";
    System.out.println(s11);
    System.out.println(s11 instanceof String);
  }
}