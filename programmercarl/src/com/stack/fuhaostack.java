package com.stack;

import java.util.Stack;

public class fuhaostack {
    public static void main(String[] args) {
        String s = "{}{}{}()()[][][](())";
        System.out.println(isRight(s));

    }
    public static boolean isRight(String s){
        Stack<Character> stack = new Stack<>();
        //第一种情况，字符串里左方向的括号多余了 ，所以不匹配。最后遍历完就可以发现
        //第二种情况，括号没有多余，但是 括号的类型没有匹配上。 peek != ch[i]
        //第三种情况，字符串里右方向的括号多余了，所以不匹配。 一个右边的去掉一个
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '('){
                stack.push(')');
            }
            else if (ch[i] == '[') {
                stack.push(']');
            } else if (ch[i] == '{') {
                stack.push(('}'));
            }
            //{}{()}
            // }
            //进左边就压入右边，
            else if(stack.isEmpty() || stack.peek()!= ch[i]){
                return false;
            }
            else stack.pop();
        }
        //最后判断栈是不是空
        return stack.isEmpty();
    }
}
