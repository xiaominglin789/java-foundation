public class Ch_4_Paremter {
  public static void main(String[] args) {
    int a = 99, b = 11;
    Test4 test4 = new Test4();
    test4.swap(a, b); // 调用交换方法
    System.out.println("a = " + a + " b = " + b); // a=99,b=11
  }
}

class Test4 {
  /** 交换位置 */
  public void swap(int a, int b) {
    System.out.println("交换前: a = " + a + " b = " + b); // a=99,b=11
    int temp = a;
    a = b;
    b = temp;
    System.out.println("交换后: a = " + a + " b = " + b); // a=11,b=99
  }
}