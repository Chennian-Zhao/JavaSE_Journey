package com.linklist;

import java.util.List;

public class mergeLinklist {
    public static void main(String[] args) {


    }
    public static ListNode mergeTwoLists(ListNode head1,ListNode head2){
        if(head1==null||head2==null){
            return head1 == null ? head2 : head1;
        }
        //头节点选两个节点里最小的那个
        ListNode head = head1.val <= head2.val ? head1 :head2;
        //选好了两个节点，一个是小的，一个是大的
        ListNode cur1 = head.next;
        ListNode cur2 = head == head1 ? head2:head1;
        ListNode pre = head;
        //开始一个一个比较，小的先放
        while (cur1!=null && cur2!=null){
            //cur1 的值小
            if(cur1.val <= cur2.val){
                pre.next = cur1;
                cur1 = cur1.next;
            }else{
                //cur2的值小
                //把pre.next指向了小的cur2
                pre.next = cur2;
                cur2 = cur2.next;
                //cur2 在自己的基础上往下走
            }
            pre = pre.next;
        }
        //还要一个没串起来
        pre.next = cur1 != null ? cur1:cur2;
        return head;
    }
}
