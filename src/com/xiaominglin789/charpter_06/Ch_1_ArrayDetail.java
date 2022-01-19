public class Ch_1_ArrayDetail {
  public static void main(String[] args) {
    int[] a = {1, 3, 52, 'a'};
    for (int child : a) {
      System.out.println(child + " ");
    }

    double[] b = new double[2];
    for (double child : b) {
      System.out.println(child);
    }

    char[] c = new char[2];
    for (char child : c) {
      System.out.println(child);
    }

    boolean[] d = new boolean[2];
    for (boolean child : d) {
      System.out.println(child);
    }

    String[] e = new String[2];
    for (String child : e) {
      System.out.println(child);
    }

    /**
    题目:
      创建一个char数组,存放:A~Z
      tip: 'A'+1 -> 'B'
     */
    char[] charArr = new char[26];
    for (int i=0; i < charArr.length; i++) {
      charArr[i] = (char)('A' + i); // 'A' + i => int => 需要强转成 char
    }
    for (char child : charArr) {
      System.out.print(child + " ");
    }
    System.out.println();


    /**
    题目:
      求出一个数值型数组的最大值及其对应的下标
      int[] arr = {4,-1,9,10,23};
      思路:
        - 假设第一个是最大值
        - 遍历数组,和假定最大值(max)比较大小
        - 如果比假定值大,那么重新设置 假定值(max) = 当前值，并且记录当前值的下标位置
        - 遍历完数组即可找到最大值和最大值的下标
     */
    int[] arr = {4,-1,9,10,23};
    int index = 0;
    int max = arr[index];
    for (int i=1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
        index = i;
      }
    }
    System.out.println("int[] arr = {4,-1,9,10,23} 的最大值: " + max + " ,下标是 " + index);

  }
}