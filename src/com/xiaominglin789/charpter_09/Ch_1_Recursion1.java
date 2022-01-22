public class Ch_1_Recursion1 {
  public static void main(String[] args) {
    /**
    打印问题
      public void test(int n) {
        if (n > 2) {
          test(n-1);
        }
        System.out.println("n=" + n);
      }
      执行: test(4),输出什么?
     */  
    
    Test1 t1 = new Test1();
    
    t1.test(4); 
  }
}

class Test1 {
  public void test(int n) {
    if (n > 2) {
      test(n-1);
    }
    System.out.println("n=" + n);
  }
}