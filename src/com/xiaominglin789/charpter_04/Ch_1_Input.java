package com.xiaominglin789.charpter_04;

import java.util.Scanner;

public class Ch_1_Input {
  public static void main(String[] args) {
    // 实例Scanner对象
    Scanner scanner = new Scanner(System.in);
    // 接收输入
    String inputValue = scanner.nextLine();
    if (inputValue != null) {
      System.out.println("你输入的是: " + inputValue);
    }
    
  }
}