package com.xiaominglin789.charpter_07;

public class Ch_1_TWArray {
  public static void main(String[] args) {
    /**
    二维数组
     */
    int[][] twArray = {
      {0,0,0,0,0},
      {0,0,1,0,0},
      {0,2,0,3,0},
      {0,0,0,0,0}
    };

    for (int i=0; i <= twArray.length-1; i++) {
      for (int j=0; j <= twArray[i].length-1; j++) {
        System.out.print(twArray[i][j] + " "); // 变量到每个元素
      }
      System.out.println(); // 换行
    }
    /**
    打印出:
      0 0 0 0 0 
      0 0 1 0 0 
      0 2 0 3 0 
      0 0 0 0 0 
     */


    /**
    题目:
    创建一个这样的二位数组
      arr = {
              {1}，
              {2，2}，
              {3，3，3}，
              {4，4，4，4},
              {5，5，5，5,5}
            }
     */
    int row = 9;
    int[][] arr = new int[row][]; // 二维数组的外层数组开辟空间，内层数组未开辟空间
    for (int i=0; i <= arr.length-1; i++) {
      arr[i] = new int[i+1]; // 二维数组的内层数组开辟空间
      for (int j=0; j < i+1; j++) {
        arr[i][j] = i+1;
      }
    }
    for (int i=0; i <= arr.length-1; i++) {
      for (int j=0; j <= arr[i].length-1; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    /**
      打印出
      1 
      2 2 
      3 3 3 
      4 4 4 4 
      5 5 5 5 5
     */
    
    /**
    杨辉三角:
      1
      1 1
      1 2 1
      1 3 3 1
      1 4 6 4 1
      1 5 10 10 5 1
      ...
      tip:
        1.第一行有1个元素,第n行有n个元素
        2.每一行的第一个元素和最后一个元素都是: 1
        3.从第三行开始,对非首、尾的元素: 
          - arr[i][j] = arr[i-1][j-1] + arr[i-1][j]

      请打印10行杨辉三角、
     */
    System.out.println("请打印10行杨辉三角: ");
    int r1 = 10;
    int[][] yang = new int[r1][];
    for (int i=0; i <= yang.length-1; i++) {
      yang[i] = new int[i+1];
      for (int j=0; j< i+1; j++) {
        if ((j == 0 || j == i) || i <= 1) {
          // 前2行 || 首尾都为 1
          yang[i][j] = 1;
        } else {
          yang[i][j] = yang[i-1][j-1] + yang[i-1][j];
        }
      }
    }
    for (int i=0; i <= yang.length-1; i++) {
      for (int j=0; j<= yang[i].length-1; j++) {
        System.out.print(yang[i][j]+ " ");
      }
      System.out.println();
    }
  }
}