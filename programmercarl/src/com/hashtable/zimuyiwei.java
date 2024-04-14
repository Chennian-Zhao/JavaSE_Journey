package com.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zimuyiwei {
    public  static void  main(String[] args) {
        int [] num1 ={1,2,2,3,4,5,6,7,8,9,10};
        int [] num2 = {2,4,2,2,2,2,6,8,10,12,14,16,18,20};
        for(int num : intersection(num1,num2)){
            System.out.printf(num+" ");
        }
        System.out.println();
        for(int num : inter(num1,num2)){
            System.out.printf(num+" ");
        }
        System.out.println();
        for(int num : intersect(num1,num2)){
            System.out.printf(num+" ");
        }


    }
    public static  int [] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> reset = new HashSet<>();
        //遍历
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            //如果set1里面包含nums2里面的元素 ，那么存入
            if(set1.contains(i)){
                reset.add(i);
            }
        }

        int[] arr = new int [reset.size()];
        int j = 0;
        for(int i :reset){
            arr[j] = i;
            j++;
        }


        
        return arr;
    }
    public static int [] inter(int [] num1, int [] num2){
        int [] hash1 = new int [1002];
        int [] hash2 = new int [1002];
        for(int i : num1){
            hash1[i]++;
        }
        for (int i : num2) {
            hash2[i]++;
        }
        List<Integer> relist = new ArrayList<>();
        for (int i = 0; i < 1002; i++) {
            if(hash1[i] > 0 && hash2[i] > 0){
                relist.add(i);
            }

        }
        int index = 0;
        int [] ans = new int[relist.size()];
        for (int integer : relist) {
            ans[index++] = integer;
        }
        return ans;

    }
    public static int [] intersect(int[] num1, int[] num2) {
        int [] hash1 = new int [1002];
        int [] hash2 = new int [1002];
        for(int i : num1){
            hash1[i]++;
        }
        for (int i : num2) {
            hash2[i]++;
        }
        List<Integer> relist = new ArrayList<>();
        for (int i = 0; i < 1002; i++) {
            //两个中一个等于0时即终止判断,所以准入条件就是两个都不能为零
            while(hash1[i] !=0 && hash2[i] !=0){
                relist.add(i);
                hash1[i]--;
                hash2[i]--;
            }   
        }
        int index = 0;
        int [] ans = new int[relist.size()];
        for (int integer : relist) {
            ans[index++] = integer;
        }
        return ans;
    }

    
}
