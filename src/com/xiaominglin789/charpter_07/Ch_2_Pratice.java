public class Ch_2_Pratice {
  public static void main(String[] args) {
    /**
    创建 int[] x,y[] 2个数组，下列选项允许通过编译的是?
     a) x[0] = y;       // x[0]->int = int[][] 不能赋值
     b) y[0] = x;       // y[0]->int[] = x->int[], 可赋值
     c) y[0][0] = x;    // y[0][0]->int = x->int[] 无法赋值
     d) x[0][0] = y;    // x[0][0] x不是二维数组
     e) y[0][0] = x[0]; // y[0][0]->int = x[0]->int 可赋值
     f) x = y;          // x->int[] = y->int[][] 无法赋值
    分析:
     int[] x => 一维数组
     int[] y[] => 二维数组
     */

    /**
    下列数组定义正确的是:__b__
     a) String strs[] = {'a', 'b', 'c'}; // 'a'、'b'、'c 字符
     b) String[] strs = {"a", "b", "c"}; // 一维数组
     c) String[] strs = new String({"a", "b", "c"}); // 编译报错
     d) String strs[] = new String[]{"a", "b", "c"}; // ok ?
     e) String[] strs = new String[]{"a", "b", "c"}; // 一维数组 = 二维数组 ?
     */
    String strs[] = new String[]{"a", "b", "c"};
    for (String s : strs) {
      System.out.println(s + " ");
    }
  }
}