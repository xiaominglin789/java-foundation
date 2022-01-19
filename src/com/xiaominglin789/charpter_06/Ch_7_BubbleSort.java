public class Ch_7_BubbleSort {
  public static void main(String[] args) {
    bubbleSortBasic();

    // 通过冒泡排序对数组进行排序
    int[] arr = {24, 69, 80, 57, 13, 90, 100, 102};
    System.out.println("原数组 arr = " + toString(arr));
    bubbleSort(arr);

    int[] arr2 = {24, 69, 80, 57, 13, 90, 100, 102};
    System.out.println("原数组 arr = " + toString(arr2));
    bubbleSortOptimized(arr2);
  }

  /**
  冒泡分析
   */
  public static void bubbleSortBasic() {
    int[] arr = {24, 69, 80, 57, 13};
    System.out.println("原数组 arr = " + toString(arr));

    /**
    遍历第一轮, 两两比较,大的数移到后面去
     */
    for (int k=0; k < arr.length-1; k++) {
      if(arr[k] > arr[k+1]) {
        int temp = arr[k];
        arr[k] = arr[k+1];
        arr[k+1] = temp;
      }
    }
    System.out.println("原数组 第1轮排序后:" + toString(arr));

    /**
    遍历第二轮, 两两比较,大的数移到后面去
      第一轮已经把大的数排到最后
     */
    for (int k=0; k < arr.length-1 - 1; k++) {
      if(arr[k] > arr[k+1]) {
        int temp = arr[k];
        arr[k] = arr[k+1];
        arr[k+1] = temp;
      }
    }
    System.out.println("原数组 第2轮排序后:" + toString(arr));

    /**
    遍历第四轮, 两两比较,大的数移到后面去
      第三轮已经把大的数排到最后
     */
    for (int k=0; k < arr.length-1 - 1 - 1; k++) {
      if(arr[k] > arr[k+1]) {
        int temp = arr[k];
        arr[k] = arr[k+1];
        arr[k+1] = temp;
      }
    }
    System.out.println("原数组 第4轮排序后:" + toString(arr));

    /**
    遍历第4轮, 两两比较,大的数移到后面去
      第二轮已经把大的数排到最后
     */
    for (int k=0; k < arr.length-1 - 1 - 1 - 1; k++) {
      if(arr[k] > arr[k+1]) {
        int temp = arr[k];
        arr[k] = arr[k+1];
        arr[k+1] = temp;
      }
    }
    System.out.println("原数组 第3轮排序后:" + toString(arr));
    // 第四轮结束，数组已经排好序了
  }

  public static void bubbleSort(int[] arr) {
    for (int i=0; i < arr.length-1; i++) {
      // 每一轮实现最大值排到最后
      for (int k=0; k < arr.length - 1 - i; k++) {
        if (arr[k] > arr[k+1]) {
          // 逆序，交换位置
          int temp = arr[k];
          arr[k] = arr[k+1];
          arr[k+1] = temp;
        }
      }
      
      System.out.println("第 " + i + " 排序后: " + toString(arr));
    }
  }

  /**
  冒泡排序优化
   */
  public static void bubbleSortOptimized(int[] arr) {
    for (int i=0; i < arr.length-1; i++) {
      boolean swtich = false; // 标记发生是否交换
      for (int k=0; k < arr.length-1 - i; k++) {
        if (arr[k] > arr[k+1]) {
          int temp = arr[k];
          arr[k] = arr[k+1];
          arr[k+1] = temp;
          swtich = true;
        }
      }

      System.out.println("第 " + i + " 排序后: " + toString(arr) + "，本轮是否发生交换: " + swtich);
      // 如果一轮遍历结束都不再发生交换了，说明已经是排好序的
      if (!swtich) {
        break;
      }
    }
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