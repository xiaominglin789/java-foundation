public class Ch_2_Factorial {
  public static void main(String[] args) {
    Test2 t2 = new Test2();
    int result = t2.factorial(5);
    System.out.println("result = " + result); // 1x2x3x4x5 = 120
  }
}

class Test2 {
  public int factorial(int n) {
    if (n == 1) {
      return 1;
    }

    return factorial(n-1) * n;
  }
}
