import java.util.Scanner;

public class Ch_2_CycleControl {
  public static void main(String[] args) {
    /**
    循环控制:
      - for
      - while
      - do...while
      - 多重循环
     */

    /**
    题目：
      打印: 1~100之间所有是9的倍数的整数,统计个数和总和
        - 9的倍数的整数 => x % 9 == 0
        - 个数 、总和
     */
    int count = 0;
    int sum = 0;
    int min = 1, max = 100, divisor = 9;
    for (int i=min; i <= max; i++) {
      if (i % divisor == 0) {
        // 满足 9的倍数
        count++;
        sum += i;
      }
    }
    System.out.println("1~100之间所有是 " + divisor + " 的倍数的整数,共有 " 
     + count + "个数, 总和: " + sum);

    /**
    题目：
      完成如下输入:
      0 + 5 = 5
      1 + 4 = 5
      2 + 3 = 5
      3 + 2 = 5
      4 + 1 = 5
      5 + 0 = 5
     */
    int sum5 = 5;
    for(int i=sum5; i >= 0; i--) {
      System.out.println((sum5-i) + " + " + i + " = " + sum5);
    }

    /**
    题目：
      统计 1-200之间 能被5整除但 不能被3整除的数的个数
     */
    int i = 1,end = 200;
    int divisor3 = 3, divisor5 = 5;
    int divisorCount = 0;
    while(i <= end) {
      if ((i % divisor5 == 0) && (i % divisor3 != 0)) {
        divisorCount++;
      }
      i++;
    }
    System.out.println("1-200之间 能被5整除但 不能被3整除的数的个数: " + divisorCount);


    /**
    题目:
      如果张三不还钱,则马保国将一直使出五连鞭抽张三,直到张三说还钱为止
      - 不停的问还钱吗
      - 使用char变量接收键盘输入
      - do-while 当 条件 char = 'y'则退出循环,否则继续循环
     */
    Scanner sc = new Scanner(System.in);
    char answer = 'n';
    do {
      System.out.print("\n马保国 使出 五连鞭 抽 张三,问: 还不还钱? y / n ");
      answer = sc.next().charAt(0);
    } while(answer != 'y');
    System.out.println();

    /**
    打印 九九乘法表
      1 x 1 = 1
      1 x 2 = 2  2 x 2 = 4
      1 x 3 = 3  2 x 3 = 6  3 x 3 = 9
      ...
      1 x 9 = 9  2 x 9 = 18  ......     9 x 9 = 81 
     */
    int xStart=1, xEnd=9;
    for (int k=xStart; k <= 9; k++) {
      for (int p=xStart; p<=k; p++) {
        System.out.print(p + " x " + k + " = " + p*k + '\t');
      }
      System.out.println();
    }

    /**
    打印 空心金字塔
           *
         *   *
        *     *
       *********

      化繁为简,先死后活:
      - 1.先打印出 5 x 9 *矩阵 
        - 1.打印半个金字塔
          *
          **
          ***
          ****
        - 2.打印整个金字塔
              *         1层  1   2*1-1 *  5-1=4空格
             ***        2层  3   2*2-1 *  5-2=3空格
            *****       3层  5   2*3-1 *  5-3=2空格
           *******      4层  7   2*4-1 *  5-4=1空格
          *********     5层  9   2*5-1 *  5-5=0空格
        - 3.控制空心金字塔
              *         1层 1位*
             * *        2层 1位* 最后位* 其他空心
            *   *       3层 1位* 最后位* 其他空心
           *     *      4层 1位* 最后位* 其他空心
          *********     5层 全部位*
     */
    System.out.println("打印 空心金字塔:");
    int oLevel= 5;
    char charStart = '*';
    for(int o=1; o <= oLevel; o++) {
      // 内for循环1-控制每层 空格 的个数
      for (int m=1;m <= oLevel - o; m++) {
        System.out.print(" ");
      }
      // 内for循环2-控制每层 * 的个数
      for (int q=1;q <= (2 * o-1); q++) {
          // （每层的第一位、最后一位） 或 最后一层
        if ((q == 1 || q == (2 * o-1)) || o == oLevel) {
          System.out.print(charStart);
        } else {
          // 其他位
          System.out.print(" ");
        }
      }
      // 每打印完一层 * 后换行、
      System.out.println();
    }
  }
}