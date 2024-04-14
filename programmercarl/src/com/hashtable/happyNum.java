package com.hashtable;

import java.util.HashSet;
import java.util.Set;

public class happyNum
{
    public static void main(String[] args) {
        int num  = 199;
        System.out.println(IshappyNum(num));

    }
    public static boolean IshappyNum(int num){
        Set<Integer> record = new HashSet<>();
        //当不包含的时候，才进去
        while(num!=1 && !record.contains(num)){
            record.add(num);
            num = getNextNumber(num);
        }
        //num == 1，返回true
        return num==1;
    }
    private static int getNextNumber(int n){
        int res =  0;
        //1^2 + 9^2 = 82
        while(n > 0){
            //取最低位
            int temp = n % 10;
            //平方
            res += temp * temp;
            //去掉最低位
            n = n/10;
        }
        return res;

    }
}
