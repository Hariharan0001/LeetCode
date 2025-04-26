/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int alen = 0;
        int blen = 0;
        while(temp1!=null){
            alen+=1;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            blen+=1;
            temp2 = temp2.next;
        }
        int diff = 0;
        if(alen<blen){
            diff  = blen-alen;
            while(diff!=0){
                headB = headB.next; 
                diff--;
            }
        }
        else{
            diff = alen-blen;
            while(diff!=0){
                headA = headA.next;
                diff--;
            }
        }
        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}