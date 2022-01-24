public class Ch_7_VarParameter {
  public static void main(String[] args) {
    VarParameter varp = new VarParameter();
    int zore = varp.sum();
    System.out.println("sum() = " + zore);

    int res = varp.sum(11, 34, 9, 12, 16);
    System.out.println("sum(11, 34, 9, 12, 16) = " + res);

    int res1 = varp.sum(new int[]{11, 34, 9, 12, 16});
    System.out.println("sum({11, 34, 9, 12, 16}) = " + res1);
  }
}

class VarParameter {
  // 计算 2个数的和，3个数的和、4个数的和、5个...
  // 你传几个数就计算几个数的和

  // 传统方式: 重载实现 2个数的和
  public int sum(int n1, int n2) {
    return n1 + n2;
  }

  // 传统方式: 重载实现 3个数的和
  public int sum(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  // 传统方式: 重载实现 4个数的和
  public int sum(int n1, int n2, int n3, int n4) {
    return n1 + n2 + n3 + n4;
  }

  // 传统方式: 重载实现 5个数的和 ... 这样继续写就有点啰嗦了、、、
  // 使用可变参数的形式来替代上述的重载
  public int sum(int ...nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }
}
