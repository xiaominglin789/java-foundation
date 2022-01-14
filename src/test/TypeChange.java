/*
TypeChange 类型转换(低->高:会自动转换, 高->低:需强制类型转换)
容量低 ----------------------------------> 容量高
byte -> short -> char -> int -> long -> float -> double
 */
public class TypeChange {
    public static void main(String[] args) {
        byte num1 = 127;
        // 低容量 赋值给 高容量,会自动转换
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        int num3 = 130;
        // 高容量 赋值给 低容量，需要强制类型转换
        // 要注意低容量的取值范围(也就是内存溢出问题)
        // 低容量的取值大小能否装得下高容量
        byte num4 = (byte) num3; // -126
        System.out.println(num3); // 130
        System.out.println(num4); // -126

        // 精度丢失
        System.out.println((int) 27.9); // 27
        System.out.println((int) -27.31F); // -27

        // 包装类 String
        String str = "xiongda";
        String result = str.replace("da", "_xxx");
        System.out.println(result);

        int i = 128;
        byte b = (byte) i;
        System.out.println(i);  // 128
        System.out.println(b); // -128

        // 自动类型转换
        double d = i;
        System.out.println(d);  // 128.0

        char c1 = 'a';
        System.out.println((int) c1); // 97
        char c2 = (char) (c1 + 1);
        System.out.println(c2);

        int c3 = 10_0000_0000; // 10亿
        System.out.println(c3);

        long c4 = (long) c3 * 299;
        System.out.println(c4);
    }
}