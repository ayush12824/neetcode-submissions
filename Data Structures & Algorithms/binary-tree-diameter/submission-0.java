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
    class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public Info diam(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }

        Info left=diam(root.left);
        Info right=diam(root.right);

        int ht=Math.max(left.ht,right.ht)+1;
        int diam=Math.max(Math.max(left.diam,right.diam),left.ht+right.ht);

        return new Info(diam,ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diam(root).diam;
    }
}
