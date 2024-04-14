package com.String;

public class restring {
    public static void main(String[] args) {
        char [] s  = {'h','e','l','l','o'};
        reverseString(s);
    }

        public static void  reverseString(char[] s) {
            for(int i = s.length -1;i>=0;i--){
                System.out.printf(String.valueOf(s[i]));
            }

        }

}
