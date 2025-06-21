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
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = 0;
        ListNode prev = head;
        while(prev!=null){
            prev = prev.next;
            size++;
        }
        int step = size/k;
        ListNode dummy = new ListNode();
        dummy.next = head;
        prev = dummy;
        while(step>0){
            ListNode cur = prev.next;
            ListNode nxt = cur.next;
            for(int i=1;i<k;i++){
                cur.next = nxt.next;
                nxt.next = prev.next;
                prev.next = nxt;
                nxt = cur.next;
            }
            prev = cur;
            step--;
        }
        return dummy.next;
    }
}