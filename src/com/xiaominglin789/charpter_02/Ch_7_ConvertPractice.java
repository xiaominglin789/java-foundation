package com.xiaominglin789.charpter_02;

public class Ch_7_ConvertPractice {
  public static void main(String[] args) {
    short s = 12; // ok, 12 在short范围内
    // short - int => int - int = 3(int) =赋值给=> short 报错
    // s = s - 9;

    byte b = 10; // ok， 10 在byte范围内
    // byte + int => int + int = 21(int) =赋值给=> byte 报错
    // b = b + 11;
    // 21(int)  强转成 byte 可以
    b = (byte)(b + 11);

    char c = 'a'; // ok, 97
    int i = 16; // ok
    float d = .314F; // ok
    // c + i + d => float + float + float = 115.314F(float) =赋值给=> double 可以
    double result = c + i + d;

    byte b1 = 16; // ok, 16 在byte范围内
    short s1 = 14; // ok, 14 在short范围内
    // short t1 = b1 + s1; // b1 + s1 = 16(int) + 14(int) = 30(int) =赋值给=> short 报错
  }
}