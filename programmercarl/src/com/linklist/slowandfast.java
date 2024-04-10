public class slowandfast {
    public static void main(String[] args) {
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast = headA;
        ListNode slow = headB;
        
        while(fast != slow){
            //这里的判断条件是fast和slow都不为空，
            //因为如果有一个为空，那么说明没有交点
            //如果fast不为null，还没走到最后呢，那么继续走
            //如果fast走到了最后，那么fast指向headB
            //如果slow不为null，还没走到最后呢，那么继续走
            //如果slow走到了最后，那么slow指向headA

            if(fast != null){
                fast = fast.next;
            } else {
                fast = headB;
            }
            
            if(slow != null){
                slow = slow.next;
            } else {
                slow = headA;
            }
        }
        //没交点，两个指针都指向null
        return fast;
    }
}