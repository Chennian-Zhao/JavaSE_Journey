package com.fundamental;
import java.util.*;
import java.io.*;
public class quickSort{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(new OutputStreamWriter(System.out));
        //读首行的数字
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] strArr =  br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        quickSort(arr,0,n-1);
        // for (int a = 0; a < arr.length; a++) {
        //     System.out.print(arr[a]+" ");
        // }
        // 打印排序后的数组
        for (int i = 0; i < n; i++) {
            wr.print(arr[i] + " ");
        }
        wr.flush();  // 刷新 PrintWriter 对象，确保所有的输出都被写入控制台
        br.close();

    }

    private static int[] quickSort(int[] arr, int left, int right) {
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
        quickSort(arr, left, j);
        quickSort(arr, j + 1, right);
        return arr;
    }

}

