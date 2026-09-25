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
    int dist = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        //for each node calc
        if(root == null)
        return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        dist = Math.max(l+r,dist);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return dist;
    }
    public int depth(TreeNode root)
    {
        if(root == null)
        return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        return Math.max(l,r) + 1;
    }

}
