package com.fundamental;

import java.io.*;
import java.util.*;

public class mergSort {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] temp = new int[n];
        String[] strArr = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        mergsortmeth(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            pw.print(arr[i]+" ");
        }
        pw.flush();
        br.close();
    }
    public static  void mergsortmeth(int[] arr,int left,int right){
        if(left>=right) return;
        //确定重点
        int[] temp = new int[right - left + 1];
        int mid = (left+right)>>1;
        mergsortmeth(arr,0,mid);
        mergsortmeth(arr,mid+1,right);


        //归并过程
        int k = 0;//已经合并的数
        int i = 1,j = mid + 1;
        while(i<= mid && j<=right){
            if(arr[i]<=arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        //没循环完的数字组直接放到后面
        while(i<mid) temp[k++] = arr[i++];
        while(j<right) temp[k++] = arr[j++];
        for(i=1,j=0;i<=right;i++,j++){
            arr[i] = temp[j];
        }

    }
}
