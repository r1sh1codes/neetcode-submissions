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
        //for each node calc ldepth and rdepth 
        // if(root == null)
        // return 0;
        // int l = depth(root.left);
        // int r = depth(root.right);
        
        // diameterOfBinaryTree(root.left);
        // diameterOfBinaryTree(root.right);
        // return dist;
         depth(root);
        return dist;
    }
    public int depth(TreeNode root)
    {
        if(root == null)
        return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        dist = Math.max(l+r,dist);
        return Math.max(l,r) + 1;
    }

}
