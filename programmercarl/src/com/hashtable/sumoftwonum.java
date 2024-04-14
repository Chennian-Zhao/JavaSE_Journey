package com.hashtable;

import java.util.HashMap;
import java.util.Map;

public class sumoftwonum
{
    public static void main(String[] args) {
        int [] num  = {1,23,34,545,567,5,8,57};
        int target = 34;


    }
    //那么判断元素是否出现，这个元素就要作为key，
    // 所以数组中的元素作为key，有key对应的就是value，value用来存下标。
    public static int [] isExit(int [] num,int target){

        //给定一个整数数组 nums 和一个整数目标值 target，
        //请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
        int []res = new int[2];
        if(num == null || num.length ==0) return res;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            //target - num[i]
            //最核心 每次都用target减去当前的值，得到的值就是要找的值
            //如果map里面有这个值，那么就找到了
            int temp = target -num[i];
            if(map.containsKey(temp)){
                //res[1] = i; res[0] = map.get(temp);
                res[1] = i;
                //map的get方法
                //返回指定键所映射的值，如果此映射不包含该键的映射关系，则返回 null。
                res[0] = map.get(temp);
                break;
            }
            //值和下标
            map.put(num[i],i);
        }
        return res;

    }

}
