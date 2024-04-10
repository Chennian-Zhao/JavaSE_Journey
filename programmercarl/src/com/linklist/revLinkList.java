package com.linklist;

public class revLinkList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur!=null){
            //当前节点的下一个节点先存好，因为你要存next 为 pre
            temp = cur.next;
            cur.next = pre;

            //整体右移
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
