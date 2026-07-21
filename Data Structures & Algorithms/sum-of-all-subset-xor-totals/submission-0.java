class Solution {
    int res;
    public int subsetXORSum(int[] nums) {
        res =0;
        List<Integer> temp = new ArrayList<>();
        fun(temp,nums,0);
        return res;
    }
    public void fun(List<Integer> temp , int[] nums,int idx)
    {
        if(idx == nums.length)
        {
            if(temp.size()!=0){
            int s = temp.get(0);
            for(int i=1;i<temp.size();i++)
            s^=temp.get(i);
            res+=s;}
            return;

        }
        
        temp.add(nums[idx]);
        fun(temp,nums,idx+1);
        temp.remove(temp.size()-1);
        fun(temp,nums,idx+1);
    }
}