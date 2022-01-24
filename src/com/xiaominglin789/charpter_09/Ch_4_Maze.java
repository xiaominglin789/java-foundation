package com.xiaominglin789.charpter_09;

public class Ch_4_Maze {
  public static void main(String[] args) {
    /**
    迷宫问题:
      0 表示可以走点, 1 表示障碍物
      {
        {1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1, 0, 1},
        {1, 0, 0, 1, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1}
      }
     */
    int row = 8;
    int column = 7;
    int[][] map = generalMap(
      row, 
      column,
      new Point(2,2),
      new Point(3,1),
      new Point(3,2),
      new Point(4,4),
      new Point(5,3)
    );
    toPrint(map);
    System.out.println();

    Point endPoint = new Point(6,5);
    findWay(map, endPoint, 1, 1);
    toPrint(map);
  }

  /**
  生成二维数组迷宫地图: 
    row: 行数
    column: 列数
    ...obstaclePoints: 障碍点
   */
  public static int[][] generalMap(int row, int column, Point ...obstaclePoints) {
    
    if (row < 1 || column < 1) {
      throw new Error("行数 >= 1, 列数 >= 1. 否则无法生成有效的二维数组地图");
    }

    int[][] map = new int[row][column];
    for (int i=0; i < row; i++) {
      for (int j=0; j< column; j++) {
        if ((i == 0 || i == row-1) || j==0 || j==(column-1)) {
          map[i][j] = 1;
        }
      }
    }

    // 设置障碍点
    if (obstaclePoints.length > 0) {
      for (Point o : obstaclePoints) {
        if (o.row < row && o.col < column) {
          map[o.row][o.col] = 1;
        }
      }
    }

    return map;
  }

  /** 打印二维整型数组 */
  public static void toPrint(int[][] arr) {
    // System.out.println("打印二维整型数组:");
    for (int i=0; i < arr.length; i++) {
      for (int j=0; j< arr[i].length; j++) {
        if (j < arr[i].length-1) {
          System.out.print(arr[i][j] + ", ");
        } else {
          System.out.print(arr[i][j]);
        }
      }
      System.out.println();
    }
  }

  /**
  找出迷宫的路径
   map: 地图
   endPoint: 出口坐标点
   row: 横坐标
   col: 纵坐标
  思路:
    1.如果找到返回 true,找不到返回 false
    2.0:可以走还没走的, 1:障碍物, 2:走过的,走得通的， 3:走过的但走不通的
    3.当 map[row][col] = 2 => true, 找到出路了。否则找不到
    4.找路的策略: 下 -> 右 -> 上 -> 左
   */
  public static boolean findWay(int[][] map, Point endPoint, int row, int col) {
    if (2 == map[endPoint.row][endPoint.col]) {
      // 找到出口点了
      return true;
    } else {
      if (map[row][col] == 0) {
        map[row][col] = 2; // 假设点可走通
        // 下一个点,尝试找路的策略: 下 -> 右 -> 上 -> 左
        if (findWay(map, endPoint, row +1, col)) { // 尝试向下
          return true;
        } else if (findWay(map, endPoint, row, col+1)) { // 尝试向右
          return true;
        } else if (findWay(map, endPoint, row-1, col)) { // 尝试向上
          return true;
        } else if (findWay(map, endPoint, row, col-1)) { // 尝试向左
          return true;
        } else {
          // 假设点可走通
          map[row][col] = 3;
          return false;
        }
      } else {
        // map[row][col] = 1,2,3
        return false;
      }
    }
  }
}

/** 点-类 */
class Point {
  public int row;
  public int col;
  
  Point(int row, int column) {
    this.row = row;
    this.col = column;
  }
}