package com.linklist;

public class swapTwoEle {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumpyhead = new ListNode(-1);
        dumpyhead.next = head;
        ListNode slow,fast;
        slow = dumpyhead;
        fast = dumpyhead;
        //n+1 ,快慢指针同时动的时候，二者的间距不再变化，类似于一个固定的死窗口
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        //竖着的指针
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        //返回虚拟头节点的下一个节点，即头节点
        return dumpyhead.next;
    }
}
