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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;

        while(temp!=null){
            size++;
            temp=temp.next;
        }

        if(size==1 && n==1){
            return null;
        }

        if(size==n){
            return head.next;
        }

        temp=head;
        int idx=0;
        while(idx<size-n-1){
            temp=temp.next;
            idx++;
        }

        temp.next=temp.next.next;
        return head;
    }
}
