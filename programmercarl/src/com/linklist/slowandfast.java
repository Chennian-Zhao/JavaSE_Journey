public class slowandfast {
    public static void main(String[] args) {
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //二者交叉走，先到的继续换个分叉走
        //二者的分叉路一个多一个少，刚开始领先的，走完一圈来长的走，就把优势抹平了
        //分叉部分记录为a 和 b [a + b = b + a]
        ListNode fast = headA;
        ListNode slow = headB
        
        while(fast!=slow){

            if(fast.next==null){
                fast.next = headB;
            }
            if(slow.next = null){
                slow.next = headA;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
    
}
