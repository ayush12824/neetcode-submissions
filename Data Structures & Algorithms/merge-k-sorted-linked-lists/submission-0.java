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
    public ListNode merge(ListNode left,ListNode right){
        if(left==null && right==null){
            return null;
        }

        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }

        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                curr.next=left;
                left=left.next;
            }else{
                curr.next=right;
                right=right.next;
            }

            curr=curr.next;
        }

        if(left!=null){
            curr.next=left;
        }

        if(right!=null){
            curr.next=right;
        }

        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0){
            return null;
        }
        if(n==1){
            return lists[0];
        }

        ListNode merged=merge(lists[0],lists[1]);
        if(n==2){
            return merged;
        }

        int idx=2;
        while(idx<n){
            ListNode curr=lists[idx];
            merged=merge(curr,merged);
            idx++;
        }

        return merged;
    }
}
