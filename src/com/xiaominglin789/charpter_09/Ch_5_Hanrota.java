public class Ch_5_Hanrota {
  public static void main(String[] args) {
    /**
    汉罗塔: A塔有从大到小 n 个盘子, B塔, C塔。要求将A塔的盘子全部移到C塔上。
      要求: 转移过程中,大盘必须在小盘的下面。
      问: 如果有5个盘子， 如何才能把它们移到C盘上？
     */
    Hanrota hta = new Hanrota();
    hta.move(3, 'A', 'B', 'C');
    System.out.println("一共移动了 " + hta.step + " 次");
  }
}

class Hanrota {
  public int step = 0;
  
  /**
  * 汉罗塔移到操作
  *  - 思路: 
  *  -   把最底下的盘子(大盘子)和其他盘子看成2个,
  *  -   只需要将A塔其他盘子移到B塔,
  *  -   大盘子移到C塔,
  *  -   再将B塔的盘子移动到C塔即可。
  * @param int panNum 盘子数
  * @param char A A塔
  * @param char B B塔
  * @param char C C塔
   */
  public void move(int panNum, char A, char B, char C) {
    if (panNum == 1) {
      // 大盘子,直接从A塔移动C塔
      System.out.println(A + "->" + C);
      step++;
    } else {
      // 只需要将A塔其他盘子移到B塔，借助C盘
      move(panNum-1, A, C, B);
      // 将A塔大盘移动到C塔
      System.out.println(A + "->" + C);
      step++;
      // 再将B塔的盘子移动到C塔,借助A盘
      move(panNum-1, B, A, C);
    }
  }
}
