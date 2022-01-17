import java.util.Scanner;

public class Ch_1_BranchControl {
  public static void main(String[] args) {
    /**
    分支控制:
      - 单分支: if (条件表达式) {}
      - 双分支: if (条件表达式) {} else {}
      - 多分支: if (条件表达式) {} else if (条件表达式2) {} ... else {}
      - switch: switch(表达式) { case 常量值: break; ...; default: break; }
     */
    
    /**
    看输出结果:
     */
    boolean b = true;
    // b=false 是赋值语句 => if(false) 不执行
    if (b = false) {
      System.out.println("1");
    } else if (b) {
      System.out.println("2");
    } else if (!b) {
      System.out.println("3"); // ！false = true, 输出: 3
    } else {
      System.out.println("4");
    }
    System.out.println();

    /**
    * 题目:
    * 参加歌手比赛,如果初赛成绩大于8.0则进入决赛，否则提示淘汰。
    * 并且根据性别提示进入男子组或女子组。输入成绩和性别，
    * 进行判断和输出信息
    * tip:double scope、char gender
    */
    Scanner sc = new Scanner(System.in);
    System.out.println("输入成绩{0.0,~,10.0}:");
    double score = sc.nextDouble();
    if (score <= 8.0) {
      System.out.println("成绩不达标,淘汰");
    } else {
      System.out.println("输入性别{'男','女'}:");
      char gender = sc.next().charAt(0);
      if (gender == '男') {
        System.out.println("恭喜进入男子组决赛\n");
      } else if (gender == '女') {
        System.out.println("恭喜进入女子组决赛\n");
      } else {
        System.out.println("沒有正確輸入性別\n");
      }
    }

    /**
    题目: 出票系统
      根据淡旺季的月份和游客的年龄,打印票价
        旺季(4月-10月):
          - 成人(18-60): 60
          - 小孩(<18): 1/2
          - 老人(>60): 1/3
        淡季:
          - 成人(18-60): 40
          - 其他: 20
     */
    System.out.print("\n输入当前月份:");
    int inputMonth = sc.nextInt();
    int basicPrice = 60;
    System.out.print("游客年龄:");
    int inputAge = sc.nextInt();
    int lastPrice = 0;
    if (inputMonth >= 4 && inputMonth <= 10) {
      // 旺季
      if (inputAge < 18) {
        lastPrice = (int)(basicPrice * 1/2);
      } else if (inputAge >= 18 && inputAge <= 60) {
        lastPrice = basicPrice;
      } else {
        lastPrice = (int)(basicPrice * 1/3);
      }
    } else {
      // 淡季
      if (inputAge >= 18 && inputAge <= 60) {
        lastPrice = (int)(basicPrice * 2/3);
      } else {
        lastPrice = (int)(basicPrice * 1/3);
      }
    }
    System.out.println("\n月份:" + inputMonth + "，年龄:" + inputAge + "，票价:" + lastPrice + "\n");

    /**
    * 题目：
    * 输入
    * 月份,打印对应的季节。
    * tip: 使用switch分支控制、穿透
    */
    System.out.println("输入月份{1,...,12}:");
    int month = sc.nextInt();
    if (month < 1 || month > 12) {
      System.out.println("输入的月份超过正确范围了");
    } else {
      String season = "";
      switch (month) {
        case 3:
        case 4:
        case 5:
          season = "春季";
          break;
        case 6:
        case 7:
        case 8:
          season = "夏季";
          break;
        case 9:
        case 10:
        case 11:
          season = "秋季";
          break;
        case 12:
        case 1:
        case 2:
          season = "冬季";
          break;
      }
      System.out.println(month + "月属于: " + season + "\n");
    }
  }
}