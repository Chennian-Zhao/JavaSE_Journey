package com.linklist;

public class detectCycle {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            //进入环内
            if(slow == fast){
                ListNode node1 = head;
                ListNode node2 = slow;
                while(node1!=node2){
                    node1 = node1.next;
                    node2 = node2.next;
                }
                //x = (n - 1) (y + z) + z
                /*
                那么 n如果大于1是什么情况呢，就是fast指针在环形转n圈之后才遇到 slow指针。
                其实这种情况和n为1的时候 效果是一样的，一样可以通过这个方法找到 环形的入口节点，
                只不过，index1 指针在环里 多转了(n-1)圈，然后再遇到index2，相遇点依然是环形的入口节点。
                 */
                return node1;
            }

        }
        return null;
    }

}
