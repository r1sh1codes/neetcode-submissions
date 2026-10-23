class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        res.add(new ArrayList<>());
        dfs(curr,nums,0);
        return res;
    }
    public void dfs(List<Integer> curr,int[] nums,int idx)
    {
        if(idx == nums.length)
        return;
        for(int i = idx; i < nums.length;i++)
        {
            if(i > idx && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            res.add(new ArrayList<>(curr));
            dfs(curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
