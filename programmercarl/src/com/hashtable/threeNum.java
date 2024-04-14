package com.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
你返回所有和为 0 且不重复的三元组。
注意：答案中不可以包含重复的三元组。
示例 1：

输入：nums = [-1,0,1,2,-1,-4]
输出：[[-1,-1,2],[-1,0,1]]
解释：
nums[0] + nums[1] + nums[2] = (-1
 */
public class threeNum {
    public static void main(String[] args) {
        int [] num = {-1,0,1,2,-1,-4};

        //创建一个 threeNum 类的实例，并调用其 threeSum 方法
        System.out.println(new threeNum().threeSum(num));

    }
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        // 排序之后如果第一个元素已经大于零，那么无论如何组合都不可能凑成三元组，直接返回结果就可以了
        for (int i = 0; i < nums.length; i++) {
            // 排序之后如果第一个元素已经大于零，那么无论如何组合都不可能凑成三元组，直接返回结果就可以了
            if (nums[i] > 0) {
                return ans;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {  // 去重a
                continue;
            }
            int right = nums.length-1;
            int left = i + 1;
            while(left<right){
                if(nums[i] + nums[left]+nums[right] == 0){
                   ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left] == nums[left+1]) left++; // 去重b
                    while(left<right && nums[right] == nums[right-1]) right--; // 去重c
                    left++;
                    right--;
                }
                else if(nums[i] + nums[left]+nums[right] > 0) right--;
                else left++;
            }

        }
        return ans;

    }
}
