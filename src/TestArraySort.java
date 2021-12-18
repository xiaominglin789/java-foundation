import java.util.Arrays;

/**
 * 数组算法比对类
 */
public class TestArraySort {
    /** 系统排序 */
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 生成随机数组
     * @param maxSize
     * @param maxValue
     * @return
     */
    public static int[] generalRandomArray(int maxSize, int maxValue) {
        // Math.random() = [0,1)
        // Math.random() * N = [0, N)
        // (int)(Math.random() * N) = [0, N-1]
        int[] arr = new int[(int)((maxSize + 1) * Math.random())];

        for (int i=0; i < arr.length; i++) {
            // arr[i] = [-N, N]
            arr[i] = (int)((maxValue + 1) * Math.random()) - (int)((maxValue + 1) * Math.random());
        }
        System.out.print("产生的数组:");
        printArray(arr);
        System.out.println();
        return arr;
    }

    /** 数组拷贝 */
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /** 数组值相同比对 */
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }

        if (arr1 == null && arr2 == null) {
            return true;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    /** 查看数组元素 */
    public static String printArray(int[] arr) {
        if (arr == null) {
            return "这是个空数组";
        }
        String res = " ";
        for (int child : arr) {
            res += child + " ";
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        // 50万次随机数组比对
        int testCount = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean isSucced = true;
        for (int i = 0; i < testCount; i++) {
            int[] arr1 = generalRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);

            // 自定义的排序方法
            insertSort(arr1);
            // 系统的排序方法
            comparator(arr2);

            if (!isEqual(arr1, arr2)) {
                isSucced = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
            System.out.print("数组:");
            printArray(arr1);
            System.out.println(" 成功通过测试!");
        }

        if (!isSucced) {
            System.out.println("sorry,你的排序方法无法通过测试！！！");
        } else {
            System.out.println("恭喜,你的排序方法测试全部能通过测试。");
        }
    }

    /** 数组位交换 */
    static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
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
     * 二分查找
     * 可以使用二分查找的情况
     * 1.在一个有序数组中,找某个数是否存在
     * 2.在一个有序数组中,找 >= 某个数最左侧的位置
     * 3.在一个有序数组中,找 <= 某个数最右侧的位置
     * 4.局部最小值问题
     */
    static void binarySearch() {

    }
}
