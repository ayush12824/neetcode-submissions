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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode left=head;
        ListNode temp=slow.next;
        slow.next=null;

        ListNode prev=null;
        ListNode curr=temp;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode right=prev;

        while(right!=null){
            ListNode nextLeft=left.next;
            ListNode nextRight=right.next;

            left.next=right;
            right.next=nextLeft;

            left=nextLeft;
            right=nextRight;
        }

    }
}
