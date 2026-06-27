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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
        return new ArrayList<>();
        List<List<Integer>> bfs= new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0)
        {
            List<Integer> level = new ArrayList<>();
            int n = q.size();
            for(int i = 0;i< n;i++)
            {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
            bfs.add(level);
        }
        for(List<Integer> x:bfs)
        res.add(x.get(x.size()-1));
        return res;
        
    }
}
