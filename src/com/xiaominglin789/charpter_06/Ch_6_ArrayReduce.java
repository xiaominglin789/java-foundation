import java.util.Scanner;

public class Ch_6_ArrayReduce {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
    int min = 4;
    
    System.out.println(" arr 的长度: " + arr.length);

    Scanner sc = new Scanner(System.in);
    while (arr.length > min) {
      System.out.print("是否需要缩减数组容量<减少 1/4>: y /n ");
      char input = sc.next().charAt(0);
      if (input == 'y') {
        // arr数组指向新数组
        arr = arrayReduce(arr);
        System.out.println("已缩减成功");
      }

      if (arr.length <= min) {
        System.out.println("已经不能再缩减了,即将退出循环体.");
      } else {
        System.out.println(" arr 的长度: " + arr.length);
      }

    }
    System.out.println(" arr 的长度: " + arr.length);
  }

  public static int[] arrayReduce(int[] arr) {
    // 这里有坑： reduce 要表示小数, 1/4 要转成 1.0/4
    double reduce = 1.0/4;
    int len = arr.length - (int)(arr.length * reduce);
    
    int[] temp = new int[len];
    for (int i=0; i < len-1; i++) {
      temp[i] = arr[i];
    }

    return temp;
  }
}