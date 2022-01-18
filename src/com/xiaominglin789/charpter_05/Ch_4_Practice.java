public class Ch_4_Practice {
  public static void main(String[] args) {
    /**
    题目一:
      司机甲带 100，000元,每次经过一次路口,需要交过路费。规则如下:
       - 1. 当现金 > 50,000 时,每次要交 5%
       - 2. 当现金 <= 50,000 时,每次交 1000
      问:司机甲可以经过多少次路口?
     */
    // 解法一
    int count = 0;
    double max = 100000;
    while (max >= 1000) {
      if (max <= 50000) {
        max -= 1000;
      } else {
        max = max - (max * 0.05);
      } 

      count++;
    }
    System.out.println("司机甲可以经过 " + count + " 次路口, 剩余: " + max);

    // 解法二
    int count2 = 0;
    double max2 = 100000;
    while (max2 > 0) {
      if (max2 > 50000) {
        max2 = max2 - (max2 * 0.05);
      } else if (max2 >= 1000 && max2 <= 50000) {
        max2 -= 1000;
      } else {
        break;
      }
      count2++;
    }
    System.out.println("司机甲可以经过 " + count2 + " 次路口, 剩余: " + max2);

    /**
    题目二:
      判断找出100-999之间的水仙花数。
        水仙花数: 153 = 1*1*1 + 5*5*5 + 3*3*3,每位数的立方的和等于数本身
     */
    int start = 100;
    int end = 999;
    for (int n=start; n <= end; n++) {
      int x100 = n / 100; // 百位
      int x10 = n % 100 / 10; // 十位
      int x1 = n % 10; // 个位
      if (n == x100 * x100 * x100 + x10 * x10 * x10 + x1 * x1 *x1) {
        System.out.println("水仙花数: " + n);
      }
    }
  }
}