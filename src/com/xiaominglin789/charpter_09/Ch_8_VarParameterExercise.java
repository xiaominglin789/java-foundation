package com.xiaominglin789.charpter_09;

public class Ch_8_VarParameterExercise {
  public static void main(String[] args) {
    /**
    有三个方法: 
      分别返回 姓名和2门课程的成绩(总分), 
        返回 姓名和3门课程的成绩(总分)
        返回 姓名和5门课程的成绩(总分
      请：封装成一个可变参数的方法
      要求类名:Methods 方法名:showScore
     */
    Methods m = new Methods();
    System.out.println(m.showScore("米兰", 50, 99.5));
    System.out.println(m.showScore("小明", 50, 25.5, 99.5));
    System.out.println(m.showScore("拿铁", 50, 25.5, 99.5, 59, 25.5));
  }
}

class Methods {
  public String showScore(String name, double ...scores) {
    double sum = 0;
    for (double score : scores) {
      sum += score;
    }

    return name + " " + scores.length + "门课程的总分: " + sum;
  }
}