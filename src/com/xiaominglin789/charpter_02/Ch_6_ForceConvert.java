public class Ch_6_ForceConvert {
  public static void main(String[] args) {
    /**
    强制类型转换: 将 容量大的数据 -赋值给-> 容量小的变量
    强转符: (类型)
     */
    int n1 = (int)1.9; // 1.9 是double,强制转换后变成 1
    System.out.println(n1); // 1， 精度丢失了

    int n2 = 20000;
    byte b1 = (byte)n2; // 造成： 数据溢出
    System.out.println(b1); // 32

	  // 2.强转符号`只针对最近的操作数`, 往往会使用小括号来提升优先级.
    // int x = (int)10 * 3.5 + 6 * 1.5; // 错误: 不兼容的类型: 从double转换到int可能会有损失
    int x = (int)(10 * 3.5 + 6 * 1.5); // (int)(44.0) = 44
    System.out.println(x); // 44

	  // 3.`char`类型可以保存 `int的常量值`,但不能保存`int的变量值`,需要强转.
    char c1 = 100; // ok, 'd'
    int m = 100; // ok
    // char c2 = m; // 错误: 不兼容的类型: 从int转换到char可能会有损失
    char c3 = (char)m; // ok
    System.out.println(c3); // 'd'

	  // 4.`byte`、`short`和`char`类型进行运算时,当`作int类型`处理.

  }
}