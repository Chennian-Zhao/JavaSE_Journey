import java.util.Collection;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        //两个节点相比较，大的就放在后面，小的放在前面
        ListNode cur = head;
        List<Interger> tank = new ArrayList<>();
        while(cur!=null){
            tank.add(cur.val);
            cur = cur.next;
        }
        Collection.sort(tank);
        ListNode cur1 = head;
        int i = 0;
        while(cur1!=null){
            cur1.val = tank.get(i++);
            cur1 = cur1.next;
        }
        return head;

    }
}