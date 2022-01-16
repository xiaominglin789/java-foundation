public class Ch_5_AssignOperator {
  public static void main(String[] args) {
    int a = 10;
    a += 4;
    System.out.println(a); // a += 4 = a + 4 = 14

    a /= 3;
    System.out.println(a); // a /= 3 = a/3 = (int)(14 / 3) = 4

    byte b = 3;
    b += 2; // b = (byte)(b + 2); 系统做了类型强转，所以能够赋值过去
    System.out.println(b);
    b++; // b = (byte)(b + 1);
    System.out.println(b);
  }
}