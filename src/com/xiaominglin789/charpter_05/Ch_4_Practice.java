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
      思路:
        - 找出: 个位、十位、百位
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

    /**
    题目三:
      输出 1~100 之间不能被5整除的数,要求:每5个一行
      - 不能被5整数的数: n % 5 != 0
      - 每5个一行: 用一个变量控制自增到5,就恢复默认值
     */
    int limit = 5;
    String res= "";
    for (int x=1, y=100, index=1; x <= y; x++) {
      if (x % 5 != 0) {
        index++;
        res = res + " " + x;
        if (index > limit) {
          System.out.println("不能被5整除的数:" + res);
          index = 1;
          res = "";
        }
      }
    }

    /**
    题目四:
      输出小写字母 a-z 以及大写的 Z~A
       - 字符 b = a + 1, W = Z - 1
     */
    for (char i = 'a';i <= 'z'; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (char i = 'Z';i >= 'A'; i--) {
      System.out.print(i + " ");
    }
    System.out.println();

    /**
    题目五：
      求出 1-1/2+1/3-1/4+1/5....+1/99-1/100 的结果
       - 奇数次 + 1/n
       - 偶数次 - 1/n
       - 循环100次
       - 注意: 1/n => 保证是double =修改=> 1.0/n
       - 遇到分数时 => 请确保值为double
     */
    double temp = 0;
    for (int i=1,tend=100; i <= tend; i++) {
      temp = (i % 2 != 0) ? (temp + 1.0/i) : (temp - 1.0/i);
    }
    System.out.println("1-1/2+1/3-1/4+1/5....+1/99-1/100 = " + temp);

    /**
    题目六：
      求出 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100) 的结果
      - 100项相加 => 外循环 i
        - 每项内部的数量都在变化 => 内循环 k
        - 条件: k <= i => 内循环的累加 => sum += k 
     */
    int next=0;
    for(int i=1,send=100; i <= send; i++) {
      for (int k=1; k <= i; k++) {
        // i=1,k=1 => next= 1
        // i=2,k=2 => next= 1 + (1 + 2)
        // i=3,k=3 => next= 1 + (1 + 2) + (1+2+3)
        // i=4,k=4 => next= 1 + (1 + 2) + (1+2+3) + (1+2+3+4)
        next += k;
      }
    }
    System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100) = " + next);
  }
}