class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> curr = new ArrayList<>();
        fun(curr,nums,target,0);
        return res;
    }
    public void fun(List<Integer> curr,int[] nums,int sum,int idx)
    {
        if(sum == 0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(idx == nums.length || sum<0)
        return;
        //choose
        curr.add(nums[idx]);
        fun(curr,nums,sum - nums[idx],idx);
        curr.remove(curr.size()-1);
        fun(curr,nums,sum,idx+1);

    }
}
