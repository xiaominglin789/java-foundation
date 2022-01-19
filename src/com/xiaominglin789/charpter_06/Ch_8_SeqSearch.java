import java.util.Scanner;

public class Ch_8_SeqSearch {
  public static void main(String[] args) {
    /**
    顺序查找
      输入要找的字符,找出它在数组中的下标
      arr = {'a', 'b', 'c', 'd'}
     */
    char[] arr = {'a', 'b', 'c', 'd'};
    System.out.println("数组 arr = " + toString(arr));
    boolean has = false;
    int index = -1;

    Scanner sc = new Scanner(System.in);
    System.out.print("输入数组中要找的字符: ");
    char findChar = sc.next().charAt(0);
    for(int i=0; i <= arr.length-1; i++) {
      if (arr[i] == findChar) {
        // 找到了
        index = i;
        System.out.println("找到了, 下标: " + i);
      }
    }
    if (index == -1) {
      System.out.println("没有找到这个字符: " + findChar);
    }

  }

  /**
  打印char数组
   */
  public static String toString(char[] arr) {
    String result = "{";

    for (int i=0; i<arr.length; i++) {
      if (i > 0 && i < arr.length) {
        result += ", ";
      }
      result += arr[i];
    }
    result += "}";

    return result;
  }
}