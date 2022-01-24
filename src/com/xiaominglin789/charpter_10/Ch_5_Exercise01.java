public class Ch_5_Exercise01 {
  public static void main(String[] args) {
    /**
    题目一:
      编写类: ArrayUtils, 定义方法max,实现求出某个double数组的最大值,并返回。
     */
    ArrayUtils utils = new ArrayUtils();
    double[] arr = new double[]{11, 31.0, 24.5, 36, 100};

    double max = utils.max(arr);
    System.out.println("最大值: " + max);

    /**
    题目二:
      编写类: ArrayUtils, 定义方法find,实现查找某字符串数组的元素查找,并且返回对应索引。
      如果找不到,返回 -1
     */
    ArrayUtils utils1 = new ArrayUtils();
    String[] arr2 = new String[]{"小铁匠", "佩奇", "kitty", "米兰", "dog"};
    int index = utils1.find(arr2, "米兰");
    if (index == -1) {
      System.out.println("没找到");
    } else {
      System.out.println("找到了, 索引 = " + index);
    }

    /**
    题目三:
      编写类: Book, 定义方法: updatePrice, 实现更改某本数的价格,集体:
        如果价格 > 150， 则更改为 150， 如果 价格 > 100, 则更改为: 100.否则不变
     */
    Book book = new Book("魔戒三部曲", 159.99);
    book.toDiscount();

    Book book1 = new Book("哈利波特全集", 129);
    book1.toDiscount();

    Book book2 = new Book("三毛流浪记", 59);
    book2.toDiscount();

    /**
    题目四: 
      实现数组的复制功能:copy, 输入 旧数组, 返回新数组,元素和旧数组一样。
     */
    ArrayUtils utils2 = new ArrayUtils();
    int[] oldArr = {99, 21, 14, 5, 36};
    System.out.println("旧数组: ");
    utils2.toPrint(oldArr);

    int[] newArr = utils2.copy(oldArr);
    System.out.println("copy 后 得到新数组: ");
    utils2.toPrint(newArr);

  }
}

class ArrayUtils {
  public double max(double[] arr) {
    double max = arr[0];
    for (int i=1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }

    toPrint(arr);
    return max;
  }

  public int find(String[] arr, String finder) {
    toPrint(arr);
    System.out.println("想要查找: " + finder);
    if (finder == null) {
      return -1;
    }

    for(int i=0; i < arr.length; i++) {
      if (finder.equals(arr[i])) {
        return i;
      }
    }
    return -1;
  }

  public int[] copy(int[] arr) {
    int[] newArr = new int[arr.length];
    for (int i=0; i < newArr.length; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

  public void toPrint(double[] arr) {
    String msg = "";
    for (double child : arr) {
      msg += child + " ";
    }
    System.out.println(msg);
  }

  public void toPrint(String[] arr) {
    String msg = "";
    for (String child : arr) {
      msg += child + " ";
    }
    System.out.println(msg);
  }

  public void toPrint(int[] arr) {
    String msg = "";
    for (int child : arr) {
      msg += child + " ";
    }
    System.out.println(msg);
  }
}


class Book {
  private double price;
  private String name;

  public Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  /** 打折 */
  public void toDiscount() {
    this.info();

    if (price > 150) {
      this.price = 150;
      System.out.println("价格更改了: " + this.price);
    } else if (price > 100 && price <= 150) {
      this.price = 100;
      System.out.println("价格更改了: " + this.price);
    }

    this.info();
  }

  public void info() {
    System.out.println("书信息: name= " + name + ",price = " + price);
  }
}