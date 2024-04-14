package com.hashtable;

import java.util.HashSet;
import java.util.Set;

public class zimuyiwei {
    public  static void  main(String[] args) {
        int [] num1 ={1,2,3,4,5,6,7,8,9,10};
        int [] num2 = {2,4,6,8,10,12,14,16,18,20};
        for(int num : intersection(num1,num2)){
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

    
}
