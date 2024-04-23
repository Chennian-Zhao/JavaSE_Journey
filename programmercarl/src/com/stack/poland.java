package com.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class poland
{
    public static void main(String[] args) {
        String[] s = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(s));
    }
    public static int evalRPN(String[] tokens) {
        //Stack<Integer> stack = new Stack<>();
        /*
        Deque<Integer> 是 Java 中的一个接口，
        它代表了一个双端队列（Double Ended Queue）。
        Deque<Integer> 提供了在队列的两端添加和删除元素的方法，
        这使得它既可以作为栈（使用 push, pop, peek 等方法），
        也可以作为队列（使用 addLast, removeFirst, peekFirst 等方法）使用。
        LinkedList<Integer> 是 Deque<Integer> 的一个实现，
        它提供了链表的特性，例如快速的元素插入和删除。
         */
        Deque<Integer> stack = new LinkedList();
        for (String token : tokens) {
            if (token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 - temp1);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            }else if(token.equals("/")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            }
            else stack.push(Integer.valueOf(token));

        }
        return stack.pop();


    }
}
