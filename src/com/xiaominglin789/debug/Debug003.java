package com.xiaominglin789.debug;

import java.util.Arrays;

public class Debug003 {
    public static void main(String[] args) {
        // 断点调试，查看方法源码
        int[] arr = {11, 9, 32, 2, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
