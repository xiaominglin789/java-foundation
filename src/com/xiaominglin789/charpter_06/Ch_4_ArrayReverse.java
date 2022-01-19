public class Ch_4_ArrayReverse {
  public static void main(String[] args) {
    /**
    数组的翻转:  
      arr = {11,22,33,44,55,66} => {66,55,44,33,22,11}
      思路:
        下标: 0  1  2  3  4  5
        a[0] <=> a[5] 交换位置
        a[1] <=> a[4] 交换位置
        a[2] <=> a[3] 交换位置
        交换3次: int changeNum = arr.length / 2
     */
    int[] arr = {11,22,33,44,55,66};
    System.out.println("翻转前 arr = " + toString(arr));
    int changeNum = arr.length / 2;
    for (int i=0; i < changeNum; i++) {
      // 用临时变量做2个变量值交换的桥梁
      int temp = arr[i];
      arr[i] = arr[arr.length-1 - i];
      arr[arr.length-1 - i] = temp;
    }
    System.out.println("翻转后 arr = " + toString(arr));

    // 方案二
    int[] arr2 = {11,22,33,44,55,66};
    System.out.println("翻转前 arr2 = " + toString(arr2));
    int len = arr2.length;
    int[] arrReverse = new int[len];
    for(int i=len-1, k=0; i >= 0; i--,k++) {
      arrReverse[k] = arr2[i];
    }
    System.out.println("翻转后得到 arrReverse = " + toString(arrReverse));
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