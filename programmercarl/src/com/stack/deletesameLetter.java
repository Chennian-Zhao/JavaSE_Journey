package com.stack;

import java.util.Stack;

public class deletesameLetter {
    public static void main(String[] args) {
        String s = "aaaaerevaedesdddgdg";
        String res = removeLetter(s);
        for (int i = 0; i < res.length(); i++) {
            System.out.printf(String.valueOf(res.charAt(i)));
        }

    }
    public static String removeLetter(String s){
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(char letter : ch){
            if(stack.isEmpty()||letter!=stack.peek()){
                stack.push(letter);
            }else stack.pop();
        }
//        StringBuilder sb = new StringBuilder();
//        while(!stack.isEmpty()){
//            sb.append(stack.pop());
//        }
//        return sb.reverse().toString();
        String result  = "";
        while(!stack.isEmpty()){
            result = stack.pop() + result;
        }
        return result;
    }
}
