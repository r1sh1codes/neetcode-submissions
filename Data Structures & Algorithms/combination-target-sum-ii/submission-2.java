class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        fun(curr,candidates,target,0);
        return res;
    }
    public void fun(List<Integer> curr,int[] nums,int sum,int idx)
    {
        if(sum == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(idx == nums.length || sum < 0) return;
        // curr.add(nums[idx]);
        // fun(curr,nums,sum - nums[idx],idx+1);
        // curr.remove(curr.size()-1);
        // fun(curr,nums,sum,idx+1);
        for(int i = idx; i < nums.length;i++)
        {
            if(i>idx && nums[i] == nums[i-1])continue;
            curr.add(nums[i]);
            fun(curr,nums,sum - nums[i],i+1);
            curr.remove(curr.size()-1);
        }
    }
}
