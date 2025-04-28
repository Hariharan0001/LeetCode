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
    public boolean check(ListNode pre, ListNode cur, int length){
        while(pre!=null && cur!=null){
            if(length%2==0){
                if(pre.val!=cur.val) return false;
                pre = pre.next;
                cur = cur.next;
            }
            else{
                if(pre.val!=cur.next.val) return false;
                pre = pre.next;
                cur = cur.next;
            }
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode next = head;
        int length = 0;
        while(next!=null){
            next = next.next;
            length++;
        }
        ListNode pre = null;
        ListNode cur = head;
        next = head;
        for(int i=0;i<length/2;i++){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return check(pre,cur,length);
    }
}