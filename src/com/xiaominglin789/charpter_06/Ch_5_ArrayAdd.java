public class Ch_5_ArrayAdd {
  public static void main(String[] args) {
    /**
    实现动态的给数组添加元素,实现对数组扩容。
      - 原始数组使用静态分配: `int[] arr = {1,2,3}`
      - 添加新元素`4`, 令 `arr = {1,2,3,4}`
     */
    int[] arr = {1,2,3}; // arr的长度=3, 下标: [0,2]
    // arr[3] = 4; // 直接下标越界, ArrayIndexOutOfBoundsException
    try {
      System.out.println(toString(arr));
      arr[3] = 4;
    } catch(ArrayIndexOutOfBoundsException e) {
      // 原数组的变量指向新数组的引用
      arr = arrayAdd(arr);
      System.out.println(toString(arr));
    } finally {
      arr[3] = 4;
      System.out.println(toString(arr));
    }
  }

  /**
  数组扩容-返回新数组
   */
  public static int[] arrayAdd(int[] arr) {
    // 新数组的长度变成原数组长度的 1.5倍。
    int len = (int)(arr.length * 1.5);
    int[] tempArr = new int[len];

    for (int i=0; i < arr.length-1; i++) {
      tempArr[i] = arr[i];
    }

    return tempArr;
  }

  /**
  打印整型数组
   */
  public static String toString(int[] arr) {
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