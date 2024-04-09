package com.linklist;

public class removeLinkList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

    }
    public ListNode removeEle(ListNode head,int val){
        //当前结点不为空，且当前结点的值是val，往下走
        while(head!=null && head.val ==val) head = head.next;
        ListNode cur = head;
        while(cur!=null){
            while(cur.next != null&&cur.next.val == val)
                cur.next = cur.next.next;
            cur = cur.next;
        }
        return head;

    }
}
