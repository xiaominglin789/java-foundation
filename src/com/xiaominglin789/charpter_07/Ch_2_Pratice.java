import java.util.Scanner;

public class Ch_2_Pratice {
  public static void main(String[] args) {
    /**
    创建 int[] x,y[] 2个数组，下列选项允许通过编译的是?
     a) x[0] = y;       // x[0]->int = int[][] 不能赋值
     b) y[0] = x;       // y[0]->int[] = x->int[], 可赋值
     c) y[0][0] = x;    // y[0][0]->int = x->int[] 无法赋值
     d) x[0][0] = y;    // x[0][0] x不是二维数组
     e) y[0][0] = x[0]; // y[0][0]->int = x[0]->int 可赋值
     f) x = y;          // x->int[] = y->int[][] 无法赋值
    分析:
     int[] x => 一维数组
     int[] y[] => 二维数组
     */

    /**
    下列数组定义正确的是:__b__
     a) String strs[] = {'a', 'b', 'c'}; // 'a'、'b'、'c 字符
     b) String[] strs = {"a", "b", "c"}; // 一维数组
     c) String[] strs = new String({"a", "b", "c"}); // 编译报错
     d) String strs[] = new String[]{"a", "b", "c"}; // ok...
     e) String[] strs = new String[]{"a", "b", "c"}; // 一维数组 = 二维数组 ?
     */
    String strs[] = new String[]{"a", "b", "c"};
    for (String s : strs) {
      System.out.println(s + " ");
    }

    /**
    题目:
     已知一个升序的数组, 要求插入一个元素，该数组顺序依然是升序的。
      int[] upArr = {10,12,45,90};

      1.查找位置
      2.数组先扩容的同时,是插入对应的位置。
     */
    
    int[] upArr = {10,12,45,90};
    System.out.println("原数组: " + toString(upArr));

    Scanner sc = new Scanner(System.in);
    System.out.print("\n任意输入一个数字: ");
    int insertNum = sc.nextInt();
    int willInsertIndex = 0;
    for (int i=0; i <= upArr.length-1; i++) {
      if (insertNum >= upArr[i]) {
        // 未来的位置
        willInsertIndex = i+1;
      }
    }
    System.out.println(insertNum + " 应该插入到下标: " + willInsertIndex);
    // 旧数组扩容操作
    int[] upArrTemp = new int[upArr.length+1];
    for(int i=0; i <= upArrTemp.length-1; i++) {
      if (i < willInsertIndex) {
        // i < x
        upArrTemp[i] = upArr[i];
      } else if (i == willInsertIndex){
        // i == x
        upArrTemp[willInsertIndex] = insertNum;
      } else {
        // i > x
        // System.out.println(i);
        upArrTemp[i] = upArr[i-1];
      }
    }
    upArr = upArrTemp;
    System.out.println("扩容后,数组: " + toString(upArr));


    /**
    下列代码输出:
    char[] arr1 = {'a', 'b', 'c', 'd'}
    char[] arr2 = arr1; // 引用传递
    arr1[2] = '中'; // 改值互相影响
    for (int i=0; i < arr2.length; i++) {
      System.out.println(arr1[i] + ", " + arr2[i])
    }
     */

    /**
    题目:
      随机生成10个整数（范围:[1-100]),保存到数组,
        要求:
         倒序打印、
         求平均值、最大值、最大值的下标、并查找里面是否存在8?
     */
    int count = 10;
    
    int[] nums = new int[count];
    int sum = 0;
    int finder = 8;
    boolean isExists = false;
    for (int i=0,limit=100; i < nums.length; i++) {
      nums[i] = (int)(Math.random() * limit + 1);
      sum += nums[i];
    }
    System.out.println("\n创建长度为10,元素在【1，100】之间的随机数组: " + toString(nums) + " ,平均值: " + (sum/nums.length));
    int max = nums[0];
    int maxIndex= 0;
    System.out.print("\n倒序打印: ");
    for (int i=nums.length-1; i >=0; i--) {
      System.out.print(nums[i] + " ");
      if (max <= nums[i]) {
        maxIndex = i;
        max = nums[i];
      }
      if (finder == nums[i]) {
        isExists = true;
      }
    }
    System.out.println();
    System.out.println("最大值是: " + max + ", 下标是: " + maxIndex);
    System.out.println("8是否在该数组中 ? " + isExists);

    /**
    手写冒泡排序
     */
    for (int i=0; i < nums.length-1; i++) {
      boolean change = false;
      for (int j=0; j < nums.length-1 - i; j++) {
        if (nums[j] > nums[j+1]) {
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
          change = true;
        }
      }
      if (!change) {
        break;
      }
    }
    System.out.println("冒泡排序后: " + toString(nums));
  }


  /**
  打印整型数组
   */
  public static String toString(int[] arr) {
    String result = "{";

    for (int i=0; i< arr.length; i++) {
      if (i > 0 && i < arr.length) {
        result += ", ";
      }
      result += arr[i];
    }
    result += "}";

    return result;
  }
}