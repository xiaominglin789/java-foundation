public class ArrayCopy {
    public static void main(String[] args) {
        /*
        数组拷贝
        将 int[] arr1 = {10,20,30}; 拷贝到 arr2数组中,要求数据空间独立
         */
        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length];

        // 数组元素为基本数据类型时,可以直接赋值
        for (int i=0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("arr2 数组:");
        for (int child:arr2) {
            System.out.print(child + " ");
        }
        System.out.println();
        System.out.println("arr1 == arr2 ? " + (arr1==arr2));
        System.out.println("arr1 = " + arr1);
        System.out.println("arr2 = " + arr2);
    }
}
