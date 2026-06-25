class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;
        for(int r = 0;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                sum-=nums[l];

                minlen = Math.min(r-l+1,minlen);;
                l++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}