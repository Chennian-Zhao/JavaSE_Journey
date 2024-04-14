package com.hashtable;

import java.util.HashMap;
import java.util.Map;

public class fourNum {
    public static void main(String[] args) {

        int [] num1 = {1,2};
        int [] num2 = {-2,-1};
        int [] num3 = {-1,2};
        int [] num4 = {0,2};
        System.out.println(fourSumCount(num1,num2,num3,num4));
    }
    
    /*Java 的思路和你描述的基本一致。以下是详细的步骤：

1. 创建一个 `HashMap`，键是数组 A 和 B 中元素之和，值是这个和出现的次数。

2. 遍历数组 A 和 B，对于每一对元素，计算它们的和，并在 `HashMap` 中更新这个和的计数。

3. 初始化一个整数变量 `count` 为 0，用于统计满足 a+b+c+d=0 的四元组的数量。

4. 遍历数组 C 和 D，对于每一对元素，计算它们的和的相反数，然后在 `HashMap` 中查找这个相反数。如果找到了，那么将 `HashMap` 中这个相反数的计数加到 `count` 上。

5. 最后，返回 `count`。


这段代码首先计算数组 A 和 B 中所有可能的两数之和，并在 `HashMap` 中记录这些和的出现次数。然后，对于数组 C 和 D 中的每一对元素，它计算这两个元素的和的相反数，并在 `HashMap` 中查找这个相反数。如果找到了，那么它将 `HashMap` 中这个相反数的计数加到 `count` 上。最后，它返回 `count`，这就是满足 a+b+c+d=0 的四元组的数量。 */
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i+j;
                //键值对，key是和，value是出现的次数，还未出现过，那么就是0
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for (int i : nums3) {
            for (int j : nums4) {
                //如果map里面有这个值，那么就找到了，相反数，就是0-i-j，太巧妙了
                res += map.getOrDefault(0-i-j,0);
            }
        }
    return res;


    }

}
