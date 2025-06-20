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
    public ListNode mergetwoList(ListNode list1, ListNode list2){
        if(list1==null && list2!=null) return list2;
        if(list2==null && list1!=null) return list1;
        if(list1==null && list2==null) return null;
        ListNode head = null;
        ListNode tail = null;
        if(list1.val<=list2.val){
            head = tail = list1;
            list1 = list1.next;
        }
        else{
            head = tail = list2;
            list2 = list2.next;
        }
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            tail.next = list1;
        }
        else{
            tail.next = list2;
        }
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0) return null;
        if(n==1) return lists[0];
        ListNode ans = lists[0];
        for(int i=1;i<n;i++){
           ans = mergetwoList(ans, lists[i]);
        }
        return ans;
    }
}