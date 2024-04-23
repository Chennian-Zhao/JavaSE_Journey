package com.fundamental;

import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }
        quickSortMethod(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //快排的本质就是分治
    private static int[] quickSortMethod(int[] arr, int left, int right) {
        // 递归终止条件，如果左边界大于等于右边界则认为递归结束
        if (left >= right) {
            return arr;
        }
        // 设定一个分界值，这里是（left + right）/ 2
        int p = arr[left + right >> 1];
        // 左右提前预留一个位置
        int i = left - 1;
        int j = right + 1;
        while (i < j) {
            // 等效于do while
            // 当数值小于分界值时持续遍历，直到找到第一个大于等于分界值的索引
            // 如果是逆序则调整两个while循环
            while (arr[++i] < p)
                ;
            while (arr[--j] > p)
                ;
            // 交换左右两侧不符合预期的数值
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 由于分界值取的是left + right >> 1，因此递归取的是left，j j + 1，right
        quickSortMethod(arr, left, j);
        quickSortMethod(arr, j + 1, right);
        return arr;
    }

}
