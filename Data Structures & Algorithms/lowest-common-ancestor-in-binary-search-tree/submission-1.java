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
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //for each root check if u can reach p and q 
        if(root ==null)
        return null;
        boolean l = dfs1(root,p);
        boolean r = dfs2(root,q);
        if(l==true && r==true)
        {
            ans = root;
        }
        lowestCommonAncestor(root.left,p,q);
        lowestCommonAncestor(root.right,p,q);
        return ans;
    }
    public boolean dfs1(TreeNode root,TreeNode p)
    {
        if(root == null)
        return false;
        if(root.val == p.val)
        return true;
        return dfs1(root.left,p) || dfs1(root.right,p);
    }
     public boolean dfs2(TreeNode root,TreeNode q)
    {
        if(root == null)
        return false;
        if(root.val == q.val)
        return true;
        return dfs2(root.left,q) || dfs2(root.right,q);
    }
}
