class Solution {
    public int majorityElement(int[] nums) {
        int curr = nums[0];
        int cnt = 1;
        int n =  nums.length;
        for(int i =1 ; i <n;i++)
        {
            if(nums[i] == curr)
            cnt++;
            else 
            {
                cnt--;
                if(cnt<0)
                {
                    curr = nums[i];
                    cnt = 1;
                }
            }
        }
        return curr;
    }
}