public class TSort {
    public static void main(String[] args) {
        int[] arr = {6,2,7,3,5};
        selectSort(arr);
        toString(arr);

        int[] arr2 = {6,2,7,3,5};
        bublleSort(arr2);
        toString(arr2);

        int[] arr3 = {6,2,7,3,5};
        insertSort(arr3);
        toString(arr3);
    }

    /**
     * 选择排序(找最小):
     * 每次假定第一个是最小的数,记录下标,
     * 往后遍历数组和它对比,从而选出最小的数,交换假定位置的数。
     * 最后得到排好序的数组
     * @param arr
     */
    static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i=0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j=i+1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }

            swap(arr, i, minIndex);
        }
    }

    /**
     * 冒泡排序(找最大):
     * 每次取出相邻的2个数比较,谁大谁就交换放在后面
     * @param arr
     */
    static void bublleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int limit = arr.length -1; limit > 0; limit--) {
            // 每次找出最大值放到正确的位置
            for (int i = 0; i < limit; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
    }

    /**
     * 插入排序:
     * 让0-0位的数有列
     * 让0-1位的数有列
     * 让0-2位的数有列
     * 让0-3位的数有列
     * ...直到0-N位的数都有序
     * @param arr
     */
    static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        // 0~i 做到有序
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr, j, j+1);
            }
        }
    }

    /** 数组位置交换 */
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /** 数组位交换 */
    static void swap2(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    static void toString(int[] arr) {
        String res = "";
        for (int child : arr) {
            res += child + " ";
        }
        System.out.println(res);
    }
}
