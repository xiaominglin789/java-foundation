public class Ch_3_RecursionExercise01 {
  public static void main(String[] args) {
    /**
    题目:
      1.求出 斐波那契数列: 1,1,2,3,5,8,13...当n(项数) = 18时,求对应的斐波那契数是
     */
    int n = 18;
    int res = fb(n);
    System.out.println("n=" + n + "时, 对应的斐波那契数是: " + res);

    /**
    题目:
      2.猴子吃桃问题:
        有一堆桃子,猴子第一天其中一半，并再多吃了一个。
        以后每天猴子都池其中的一半,并再多吃了一只。当到了第十天时(还没吃)。发现只剩下 1个桃子了。
        问: 最初一共有多少个桃子?
     */
    int day = 1;
    int peachCount = peach(day);
    System.out.println("第 " + day + " 天一共有 " + peachCount + " 个桃子");
  }

  /**
    题目:
      1.求出 斐波那契数列: 1,1,2,3,5,8,13...当n(项数) = 18时,求对应的斐波那契数是
        - 规律 
          n = 1, v = 1
          n = 2, v = 1
          n = 3, v = 2 + 1
          n = 4, v = 3 + 2
          ...
          n >= 2; v = n-1 + n-2
     */
  public static int fb(int n) {
    if (n < 1) {
      throw new Error("你输入 n= " + n  + " ，但 n 必须大于等于 1 的整数.");
    }
    if (n == 1 || n == 2) {
      return 1;
    } else {
      return fb(n-1) + fb(n-2);
    }
  }

  /**
    题目:
      2.猴子吃桃问题:
        有一堆桃子,猴子第一天其中一半，并再多吃了一个。
        以后每天猴子都池其中的一半,并再多吃了一只。当到了第十天时(还没吃)。发现只剩下 1个桃子了。
        问: 最初一共有多少个桃子?
      分析:
        今天的桃子数 = (明天的桃子数 + 1) * 2
        k=10,v10 = 1
        k= 9,v9 = (v10 + 1) * 2 = (1 + 1) * 2 = 4
        k= 8,v8 = (v9 + 1) * 2 = (4 + 1) * 2 = 10
        k= 7,v7 = (v8 + 1) * 2 = (10 + 1) * 2 = 22
        ...
        k= 1,v1 = ?
     */
  public static int peach(int k) {
    if (k == 10) {
      return 1;
    } else if (k >= 1 && k < 10) {
      return (peach(k+1) + 1) * 2;
    } else {
      throw new Error("输入的天数要在: 1~10 之间");
    }
  }
}