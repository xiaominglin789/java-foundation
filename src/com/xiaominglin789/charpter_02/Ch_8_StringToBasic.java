public class Ch_8_StringToBasic {
  public static void main(String[] args) {
    /**
    基本数据类型 与 String字符串的转换
      - 基本数据类型 -> String字符串
      - String字符串 -> 基本数据类型
     */

    // 基本数据类型 -> String字符串
    int n1 = 100;
    float f1 = 1.1f;
    double d1 = 4.5;
    boolean b1 = true;
    
    String s1 = n1 + ""; // "100"
    String s2 = f1 + ""; // "1.1"
    String s3 = d1 + ""; // "4.5"
    String s4 = b1 + ""; // "true"

    // String字符串 -> 基本数据类型
    // 需要使用基本数据类型 对应的包装类 parseXxx(String值)
    String s5 = "123";
    int num = Integer.parseInt(s5);
    System.out.println(num); // 123

    int n11 = Integer.parseInt(s1); // 100
    float f11 = Float.parseFloat(s2); // 1.1f
    double d11 = Double.parseDouble(s3); // 4.5
    boolean b11 = Boolean.parseBoolean(s4); // true
    long lon11 = Long.parseLong("12342"); // 12342
    short sh11 = Short.parseShort("212"); // 212
    byte by11 = Byte.parseByte("110"); // 110
    
    // 字符串 转 字符: 把字符串的第一个字符返回去。
    String chars = "abcdef";
    System.out.println(chars.charAt(0)); // 'a'
    
    // System.out.println(ch11);
    byte by12 = Byte.parseByte("128"); // 编译通过，但运行报错
    // byte的范围: -128~127
    // Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10。
    System.out.println(by12); // 运行异常
  }
}