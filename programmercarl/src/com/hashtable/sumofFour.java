package com.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumofFour {
    public static void main(String[] args) {
//        nums = [1,0,-1,0,-2,2], target = 0
//        nums = [2,2,2,2,2], target = 8
        int [] nums2 = {2,2,2,2,2};int sout = 8;
        int [] nums = {1,0,-1,0,-2,2};int  target = 0;
        System.out.println(new sumofFour().fourSum(nums,target));
        System.out.println(new sumofFour().fourSum(nums2,sout));

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            // nums[i] > target 直接返回, 剪枝操作
            /*
            但是有一些细节需要注意，例如： 不要判断nums[k] > target 就返回了，
            三数之和 可以通过 nums[i] > 0 就返回了，
            因为 0 已经是确定的数了，四数之和这道题目 target是任意值。
            比如：数组是[-4, -3, -2, -1]，target是-10，不能因为-4 > -10而跳过。
            但是我们依旧可以去做剪枝，逻辑变成nums[i] > target && (nums[i] >=0 || target >= 0)就可以了。
             */
            if (nums[i] > 0 && nums[i] > target) {
                return result;
            }

            if (i > 0 && nums[i - 1] == nums[i]) {    // 对nums[i]去重
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                if (j > i + 1 && nums[j - 1] == nums[j]) {  // 对nums[j]去重
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                while (right > left) {
                    // nums[k] + nums[i] + nums[left] + nums[right] > target int会溢出
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // 对nums[left]和nums[right]去重
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;

                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
