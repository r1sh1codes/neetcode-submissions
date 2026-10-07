class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pf = new int[n];
        int[] sf = new int[n];
        pf[0] = nums[0];
        sf[n-1] = nums[n-1];
        for(int i = 1; i < n;i++)
        pf[i] = pf[i-1] * nums[i];
        for(int i = n- 2;i>=0;i--)
        sf[i] = sf[i+1] * nums[i];
        // for(int x:pf)
        // System.out.println(x);
        // for(int x:sf)
        // System.out.println(x);
        nums[0] = sf[1];
        for(int i = 1; i < n-1;i++)
        {
            nums[i] = pf[i-1] * sf[i+1];
        }
        nums[n-1] = pf[n-2];
        return nums;
    }
}  
