class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        boolean[] take= new boolean[nums.length];
        fun(curr,nums,take,0);
        return res;
    }
    public void fun(List<Integer> curr,int[] nums,boolean[] take,int idx)
    {
        if(idx == nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length;i++)
        {
            if(!take[i]){
            curr.add(nums[i]);
            take[i] = true;
            fun(curr,nums,take,idx+1);
            curr.remove(curr.size()-1);
            take[i] = false;
            }
        }
    }
}
