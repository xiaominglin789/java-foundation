/*
十进制形式： 3.14   3.210F    .512
科学计数法:  5.12e2 -> 5.12 x 10的2次方 = 512.0
			512e-2 / 512E-2 -> 512 x 10的负2次方 = 5.12
*/
public class FloatDetail {
    public static void main(String[] args) {
        // float num1 = 1.1; // 默认double,会报错: 错误: 不兼容的类型: 从double转换到float可能会有损失
        float num2 = 1.1F;
        float n2 = 1F;

        double num3 = 1;
        double num4 = 1D;
        System.out.println(num3==num4); // true

        double num5 = 1.1F; // 小精度可以赋值给大精度的,但是避免这样使用

        System.out.println(5.12e2); // 512.0
        System.out.println(512e-2); // 5.12

        double num6 = 2.122222233D;
        float num7  = 2.122222233F;
        double num8 = 2.122222233F;
        System.out.println(num6); // 2.122222233
        System.out.println(num7); // 2.1222222
        // tip4:避免使用`double x = 1.1F;` 这种跨类型定义方式,因为2种类型的精度范围是不同的,和期待的值有偏差
        System.out.println(num8); // 2.1222221851348877

        // 浮点数使用陷阱: 2.7  和  8.1/3 比较
        // 当我们对运算结果是小数的进行相等判断时,要小心
        double num9 = 2.7;
        double num10 = 8.1 / 3;
        System.out.println(num9); // 2.7
        System.out.println(num10); // 2.6999999999999997

        float num11 = 0.1F;
        float num12 = 1.1F/10;
        System.out.println(num11==num12); // false

        float num13 = 0.1F;
        double num14 = 1/10;
        System.out.println(num13==num14); // false

        double n5 = 1.1;
        float n6 = 1.1F;
        System.out.println(n5);
        System.out.println(n6);
        System.out.print("结果:");
        System.out.println(n5==n6); // false

        float n7 = 123456789f;
        float n8 = n7 + 1;
        System.out.println(n7==n8); // ?
    }
}