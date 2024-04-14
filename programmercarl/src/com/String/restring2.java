package com.String;

public class restring2 {
    public static void main(String[] args) {

    }

        public String reverseStr(String s, int k) {
            char [] ch = s.toCharArray();
            for (int i = 0; i < ch.length-1; i+= 2*k) {
                int left = i;
                int right = Math.min(ch.length-1,i+k-1);
                while(left < right){
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                }
            }
            return new String(ch);

        }



}
