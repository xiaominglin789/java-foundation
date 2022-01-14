public class Ch_4_BooleanType {
  public static void main(String[] args) {
    boolean isPass = false;
    if (isPass) {
      System.out.println("通过");
    } else {
      System.out.println("无法通过");
    }

    // boolean isTest = 0; // 编译错误: 不兼容的类型: int无法转换为boolean
  }
}