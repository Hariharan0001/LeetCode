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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        dummy.next = head;
        ListNode nxt = head.next;
        while(nxt!=null){
            head.next = nxt.next;
            nxt.next = prev.next;
            prev.next = nxt;
            nxt = head.next;
            prev = head;
            head = nxt;
            if(nxt!=null){
                nxt = nxt.next;
            }
        }
        return dummy.next;
    }
}