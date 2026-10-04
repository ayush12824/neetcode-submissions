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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        ListNode left=l1;
        ListNode right=l2;
        int carry=0;

        while(left!=null && right!=null){
            int num=left.val+right.val;
            num=num+carry;
            carry=num/10;
            num=num%10;
            ListNode newNode=new ListNode(num);
            curr.next=newNode;
            curr=curr.next;
            left=left.next;
            right=right.next;
        }

        while(right!=null){
            int num=right.val;
            num+=carry;
            carry=num/10;
            num=num%10;
            ListNode newNode=new ListNode(num);
            curr.next=newNode;
            curr=curr.next;
            right=right.next;

        }

        while(left!=null){
            int num=left.val;
            num+=carry;
            carry=num/10;
            num=num%10;
            ListNode newNode=new ListNode(num);
            curr.next=newNode;
            curr=curr.next;
            left=left.next;
        }

        if(carry>0){
            ListNode newNode=new ListNode(carry);
            curr.next=newNode;
        }

        return dummy.next;
    }
}
