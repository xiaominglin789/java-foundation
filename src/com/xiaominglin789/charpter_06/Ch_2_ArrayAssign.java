public class Ch_2_ArrayAssign {
  public static void main(String[] args) {
    /**
    8大基本数据类型: 赋值 -> 值传递
      - 值拷贝(值传递),不会相互影响
     */
    int n1 = 1;
    int n2 = n1; // 不会相互影响
    System.out.println("n1 = " + n1 + " , n2 = " + n2);
    n2 = 99; // 改变 n 2的值,会不会改变 n1 的值 ? 不会
    System.out.println("n1 = " + n1 + " , n2 = " + n2);

    /**
    数组: 赋值 -> 引用传递
      - 引用传递, 会相互影响
    */
    int[] a1 = {1,2,3};
    int[] a2 = a1; // 引用传递
    System.out.println("a1 = " + toString(a1) + " , a2 = " + toString(a2));

    System.out.println("修改值: a2[1] = 99 ");
    a2[1] = 99; // 修改一方的某个值, 会影响到另一方。
    System.out.println("a1 = " + toString(a1) + " , a2 = " + toString(a2));
  }

  /**
  打印整型数组
   */
  public static String toString(int[] arr) {
    String result = "{";

    for (int i=0; i<arr.length; i++) {
      if (i > 0 && i < arr.length) {
        result += ", ";
      }
      result += arr[i];
    }
    result += "}";

    return result;
  }
}