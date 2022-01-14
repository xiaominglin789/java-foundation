public class Ch_2_FloatType {
  public static void main(String[] args) {
    /**
    浮点类型:
      - float[4]、double[8]
      - 小数默认是double, 声明浮点数时,必须 加 `f`|`F`、`d`|`D`
      - 通常情况下,使用double类型声明小数。
     */
    // float n1 = 1.1; // 编译错误: 不兼容的类型: 从double转换到float可能会有损失
    float n2 = 1.1F; // 
    System.out.println(n2);
    double n3 = 1.1; // 小数默认double,可以给double
    System.out.println(n3);
    double n4 = 1.1d; //
    System.out.println(n4);

    double n5 = 1.32f; // 小的值 放进 大空间,可以
    System.out.println(n5); // 1.3200000524520874

    // double 比 float 精度更高
    double n6 = 0.124784654674;
    System.out.println(n6); // 0.124784654674
    float n7 =  0.124784654674f;
    System.out.println(n7); // 0.124784656， 精度缺失,因为尾数

    /**
    浮点数的使用陷阱:
      - 当我们对运算结果为小数的数,进行相等判断时,要小心!
        + 应该一两个数的差值的绝对值在某个范围内判断
     */
    double n10 = 2.7;
    System.out.println(n10); // 2.7
    double n11 = 8.1 / 3;
    System.out.println(n11); // 2.6999999999999997

    if (n10 == n11) {
      System.out.println("不会进入这里面");
    } 
    if (Math.abs(n10 - n11) < 0.000001) {
      System.out.println(Math.abs(n10 - n11));
      System.out.println("应该用差值绝对值范围来判断相等");
    }
  }
}