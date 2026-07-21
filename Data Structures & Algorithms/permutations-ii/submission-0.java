class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] taken = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        fun(temp,0,nums,taken);
        return res;
    }
    public void fun(List<Integer> temp,int idx,int[] nums,boolean[] taken)
    {
            if(temp.size() == nums.length)
            {
                res.add(new ArrayList<>(temp));
                return;
            }

        for(int i = 0 ;i < nums.length ;i++)
        {
            if(i > 0 && nums[i] == nums[i-1] && !taken[i-1]) continue;
            if(!taken[i])
            {
            temp.add(nums[i]);
            taken[i] = true;
            fun(temp,i+1,nums,taken);
            taken[i] =false;
            temp.remove(temp.size()-1);

            }
        }
    }
}