/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public void find(TreeNode root,int k,ArrayList<Integer> list){
        if(root==null){
            return;
        }

        find(root.left,k,list);

        if(list.size()==k){
            return;
        }
        list.add(root.val);
        find(root.right,k,list);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        find(root,k,list);
        return list.get(list.size()-1);

    }
}
