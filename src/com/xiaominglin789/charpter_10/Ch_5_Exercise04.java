public class Ch_5_Exercise04 {
  public static void main(String[] args) {
    /**
    题目十一:
     有个人 Tom, 设计它的成员变量，成员方法可以电脑猜拳；
     电脑每次都会生成： 0， 1， 2
      0： 石头
      1： 剪刀
      2： 布
     猜拳n次，显示Tom赢的次数。
     */
    int count = 10;
    Tom tom = new Tom();
    Tom pc = new Tom();
    tom.guess(pc, count);
  }
}

class Tom {
  private int success = 0;
  private int pingju = 0;
  private int fail = 0;

  /**
  0： 石头
  1： 剪刀
  2： 布
   */
  public void guess(Tom pc, int count) {
    for (int i=0; i < count; i++) {
      int pcOut = pc.random();
      int tomOut = this.random();
      System.out.print("pc: " + switchChar(pcOut) + " vs tom: " + switchChar(tomOut));
      if ((tomOut == 0 && pcOut == 1) ||
        (tomOut == 1 && pcOut == 2) ||
        (tomOut == 2 && pcOut == 0)
      ) {
        System.out.print(",tom赢");
        success++;
      } else if (tomOut == pcOut) {
        pingju++;
      } else {
        fail++;
      }
      System.out.println();
    }

    System.out.println("和pc猜拳: " + count + "次, tom赢了: " + success + "次,平局: " + pingju + "次,输了 " + fail + "次");
  }

  public String switchChar(int index) {
    String str = "";
    switch (index) {
      case 0:
        str = "石头";
        break;
      case 1:
        str = "剪刀";
        break;
      case 2:
        str = "布";
        break;
    }
    return str;
  }

  public int random() {
    return (int)(Math.random()*3); // [0~2];
  }
}
