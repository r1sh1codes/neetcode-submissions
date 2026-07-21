class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] taken = new boolean[nums.length];
        fun(nums,taken,temp,0);
        return res;
    }
    public void fun(int[] nums,boolean[] taken,List<Integer> temp,int idx)
    {
            if(temp.size() == nums.length)
            {
                res.add(new ArrayList<>(temp));
                return;
            }

        for(int i = idx ;i  < nums.length; i++)
        {
            if(taken[i] == false)
           { 
            temp.add(nums[i]);
             taken[i] = true;
            fun(nums,taken,temp,0);
           
            temp.remove(temp.size()-1);
            taken[i] =false;
           } 
           else
           continue;
        }
    }
}
