package com.linklist;
//定义链表结点
public class ListNode {
    //节点值
    int val;
    //下一个结点
    public ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
