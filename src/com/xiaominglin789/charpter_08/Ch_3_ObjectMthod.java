public class Ch_3_ObjectMthod {
  public static void main(String[] args) {
    Person girl = new Person();
    // 方法的调用
    girl.speak();
    girl.calculated(1, 100);

    int result = girl.sum(21, 79);
    System.out.println("计算结果: " + result);
  }
}

class Person {
  public String name;
  public int age;

  public void speak() {
    System.out.println("你是一个好人.");
  }

  /**
   * 计算 min-max 的和
   * @param {int} min 
   * @param {int} max 
   */
  public void calculated(int min, int max) {
    if (min > max)  {
      int temp = min;
      min = max;
      max = temp;
    }

    int sum = 0;
    for (int i=min; i <= max; i++) {
      sum += i;
    }

    System.out.println("计算 1-100的和: " + sum);
  }

  /**
   * 加法运算
   * @param {int} - a
   * @param {int} - b
   * @return {int} - a+b
   */
  public int sum(int a, int b) {
    return a + b;
  }
}