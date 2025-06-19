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
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return head;
        ListNode ans = head;
        ListNode nxt = head.next;
        while(nxt!=null){
            if(head.val==nxt.val){
                while(nxt!=null && head.val==nxt.val){
                    nxt = nxt.next;
                }
                head.next = nxt; 
            }
            head = head.next;
            if(head!=null){
                nxt = head.next;
            }
        }
        return ans;
    }
}