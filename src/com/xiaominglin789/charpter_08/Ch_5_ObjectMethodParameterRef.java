public class Ch_5_ObjectMethodParameterRef {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    Test5 test5 = new Test5();
    test5.changeOne(arr);
    System.out.println(test5.toString(arr)); // {1,99,3,4,5}

    int[] arr2 = {1,2,3,4,5};
    test5.changRefNull(arr2);
    System.out.println(test5.toString(arr2)); // {1,2,3,4,5}
  }
}

class Test5 {
  public void changeOne(int[] arr) {
    arr[1] = 99; // 改值
  }
  public void changRefNull(int[] arr) {
    arr = null;
  }

  public String toString(int[] arr) {
    String result = "{";
    for (int i=0; i< arr.length; i++) {
      if (i > 0 && i < arr.length) {
        result += ", ";
      }
      result += arr[i];
    }
    return result += "}";
  }
}