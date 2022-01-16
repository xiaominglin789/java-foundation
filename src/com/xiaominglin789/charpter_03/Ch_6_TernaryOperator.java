public class Ch_6_TernaryOperator {
  public static void main(String[] args) {
    int a = 10;
    int b = 99;

    int result = a < b ? a++ : b--;
    // 10 < 99 true => result = a++
    // temp = a = 10;  a = a+1 = 11; result = temp = 10
    System.out.println("result=" + result); // 10
    System.out.println("b=" + b); // 99
    System.out.println("a=" + a); // 11

    int result2 = a > b ? --a : --b;
    // 11 > 99 ? false => result2= --b
    // b = b-1=98; temp=b=98; result2 = temp=98
    System.out.println("result2=" + result2); // 98
    System.out.println("b=" + b); // 98
    System.out.println("a=" + a); // 10

    /**
    三元运算-细节
      - 条件 ? 表达式1 : 表达式2
      - 表达式1 和 表达式2 要为可以赋值给接收变量的类型
        + 自动类型转换
        + 强转
      - 三元运算的本质: if(条件) { 表达式1 } else { 表达式2 }
     */
    int n1 = 3;
    int n2 = 8;
    int res1 =  n1 > n2 ? n1++ : --n2;
    // res1 = 3 > 8 ? false = --n2 => n2=n2-1=7;temp=7;res1=temp=7
    System.out.println("res1=" + res1); // res1=7

    // res2 = 3 > 7 ? false = --n2 => n2=n2-1=6;temp=6;res2=(double)temp=6.0
    double res2 = n1 > n2 ? n1++ : --n2;
    System.out.println("res2=" + res2); // res2=6.0
    
    // res3 = 3 > 6 ? false = --n2 => n2=n2-1=5;temp=5;res3=(byte)5=5
    byte res3 = (byte)(n1 > n2 ? n1++ : --n2);
    System.out.println("res3=" + res3); // res3=5

    /**
    找出三个数的最大值
      - 相邻2个数比较找出最大的,和下一个进行比较
     */
    int b1 = 55, b2 = 33, b3 = 123;
    int max = b1 > b2 ? b1 : b2;
    max = max > b3 ? max : b3;
    System.out.println("三个数中的最大数:" + max); // 123
  }
}