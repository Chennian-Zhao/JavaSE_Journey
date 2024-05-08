package com.fundamental;
import java.io.*;

public class Main{
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

         //读入一行字符
         String str1 = br.readLine();
         //读入一个数字
         int n = Integer.parseInt(br.readLine());
         //读入一行字符数字
         String[] str2 = br.readLine().split(" ");


         //读入一行的分开的数字
         String[] str3 = br.readLine().split(" ");
         int[] arr0  = new int[n];
         for (int i = 0; i < arr0.length; i++) {
             arr0[i] = Integer.parseInt(str3[i]);
         }

         //读入一个数组
            //先定义一个数组
         int[] arr = new int[n];
         for (int i = 0; i < arr.length; i++) {
             //每循环一次，都读入字符数组最前面的元素
             arr[i] = Integer.parseInt(br.readLine().split(" ")[0]);
         }



    }

}