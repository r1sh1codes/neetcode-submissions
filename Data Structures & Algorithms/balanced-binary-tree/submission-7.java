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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
         return true;
        int lh = depth(root.left);
        int rh = depth(root.right);
        if(Math.abs(lh-rh)>1)
        return false;
        boolean l = isBalanced(root.left);
        if(l == false)
        return false;
        boolean r = isBalanced(root.right);
        if(r == false)
        return false;
        return true;
    }
    public int depth(TreeNode root)
    {
        if(root == null)
        return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
