class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        fun(nums,target,0,temp);
        return res;
    }
    public void fun(int[] nums,int target,int idx,List<Integer> temp)
    {   
        if(target == 0)
        {
            List<Integer> copy = new ArrayList<>(temp);
            res.add(copy);
            return;
            
        }

        if(target<0 || idx == nums.length)
        {
            return;
        }
        temp.add(nums[idx]);
        target-=nums[idx];
        fun(nums,target,idx,temp);
        target+=nums[idx];
        temp.remove(temp.size()-1);
        fun(nums,target,idx+1,temp);
    }
}
