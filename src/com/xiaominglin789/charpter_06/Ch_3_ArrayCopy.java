public class Ch_3_ArrayCopy {
  public static void main(String[] args) {
    basicArrayCopy();
  }

  public static void basicArrayCopy() {
    /**
    基本数据类型数组的拷贝
     */
    int[] a = {10, 20, 30};

    // copyA 重新开辟一个和 a容量大小一样的空间
    int[] copyA = new int[a.length];
    for (int i=0; i < a.length; i++) {
        copyA[i] = a[i];
    }
    System.out.println(" a = " + toString(a) + " , copyA = " + toString(copyA));

    System.out.println("修改copyA[1] = 99");
    copyA[1] = 99;
    System.out.println(" a = " + toString(a) + " , copyA = " + toString(copyA));
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
  

  /** 判断 传入的Object 是不是基本数据类型 */
  public static boolean isBasicType(Object obj) {
    Class  classType = obj.getClass();
    if (
      classType.equals(java.lang.Byte.class) || 
      classType.equals(java.lang.Short.class) || 
      classType.equals(java.lang.Integer.class) || 
      classType.equals(java.lang.Long.class) || 
      classType.equals(java.lang.Float.class) || 
      classType.equals(java.lang.Double.class) || 
      classType.equals(java.lang.Character.class) || 
      classType.equals(java.lang.Boolean.class)
    ) {
      return true;
    }
    return false;
  }
}