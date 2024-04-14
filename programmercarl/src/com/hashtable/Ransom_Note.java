package com.hashtable;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransom= "hheellooww";
        String magazines  = "hheelloowwhhhkkkkkekekfe";
        System.out.println(isTrue(ransom,magazines));

    }
    public static boolean isTrue(String ranson, String magazines){
        if(ranson.length()>magazines.length())return false;

        int [] letterArr = new int [26];
        for(char ch :magazines.toCharArray()){
            letterArr[ch - 'a']++;
        }
        for(char ch:ranson.toCharArray()){
            letterArr[ch - 'a']--;
        }
        for (int i : letterArr) {
            if(i<0)return false;
        }
        return true;
    }
}
