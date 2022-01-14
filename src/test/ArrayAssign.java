public class ArrayAssign {
    public static void main(String[] args) {
        /*
        基本数据类型赋值,这个值就是具体的数据,而且相互不影响
        基本数据类型赋值方式: 值拷贝
         */
        int n1 = 2;
        int n2 = n1;
        // 修改 n2 的值,不会影响 n1
        n2 = 99;
        System.out.println("n1=" + n1); // n1=2
        System.out.println("n2=" + n2); // n1=99

        /*
        数组在默认情况下是 `引用传递`, 赋的值是 `地址`
        赋值方式: 引用传递
         */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        // 修改 arr2 的某个值，arr1 也被影响了
        arr2[1] = 99;
        System.out.println("查看arr1的元素：");
        for (int child:arr1) {
            System.out.print(child + " "); // arr1 = {1, 99, 3}
        }
        System.out.println();
    }
}
