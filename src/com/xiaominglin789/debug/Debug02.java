package com.xiaominglin789.debug;

public class Debug02 {
    public static void main(String[] args) {
        // 调试-数组下标越界
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("下标: " + i + " = " + arr[i]);
        }
        System.out.println("程序结束...");
    }
}
