package com.xiaominglin789.charpter_05;

import java.util.Scanner;

public class Ch_3_BreakExercise {
  public static void main(String[] args) {
    /**
    题目:
      1-100以内的数求和,求出当和第一次大于20的当前数
        - 1.循环 sum+=i
        - 2. sum > 20 break
     */
    int currentNum = 0;
    for (int i=1,sum=0,out=20,end=100;i <= end; i++) {
      if (sum > out) {
        currentNum = i-1;
        break;
      }
      sum += i;
    }
    System.out.println("1-100以内的数求和,求出当和第一次大于20的当前数: " + currentNum);


    /**
    题目二:
      实现登录认证系统，3次机会。
     */
    String username = "admin";
    String password = "123";
    int lessCount = 3;
    boolean isLocked = false;
    System.out.println("登录认证系统:");
    Scanner sc = new Scanner(System.in);
    while(lessCount > 0 || !isLocked) {
      System.out.println("输入账号:");
      String usr = sc.next();
      System.out.println("输入密码:");
      String pwd = sc.next();
      if (username.equals(usr) && password.equals(pwd)) {
        System.out.println("登录成功~");
        break;
      }

      lessCount--;
      if (lessCount == 0) {
        isLocked = true;
        System.out.println("3次输入错误,账号暂时冻结~");
      } else {
        System.out.println("账号或密码错误，只剩下 " + lessCount + " 次机会.");
      }
    }
  }
}