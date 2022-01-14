public class Ch_1_IntegerType {
  public static void main(String[] args) {
    /**
    整数类型:
      - byte[1]: 占1个字节, 取值范围: -128~127
      - short[2]: 占2个字节
      - int[4]: 占4个字节
      - long[8]: 占8个字节
     */
    byte n1 = 10; // 1个字节的 10
    short n2 = 10; // 2个字节的 10
    int n3 = 10; // 4个字节的 10
    long n4 = 10; // 8字节的 10

    /**
    整型类型-细节:
      - 1.java的各整数类型有固定的范围和字段长度,不受具体OS操作系统的影响。
      - 2.整数常量默认是 `int`型,声明`long`型常量必须加`l`或`L`
      - 3.整型声明一般都使用`int`型, 装不下或不确定,才用更大的类型
      - 4.`bit`:计算机最小存储单位（bit: 位）,`1byte = 8bit`
     */
  }
}