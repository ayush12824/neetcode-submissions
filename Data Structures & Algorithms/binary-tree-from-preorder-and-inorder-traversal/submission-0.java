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
    int idx=0;
    public TreeNode build(int[] preorder, int[] inorder,int left,int right){
        if(left>right){
            return null;
        }

        int rootVal=preorder[idx++];
        TreeNode root=new TreeNode(rootVal);

        int i=0;
        while(inorder[i]!=rootVal){
            i++;
        }

        root.left=build(preorder,inorder,left,i-1);
        root.right=build(preorder,inorder,i+1,right);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return build(preorder,inorder,0,inorder.length-1); 
    }
}
