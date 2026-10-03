class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = 0;
        for(int x:piles)
        high = Math.max(x,high);
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            System.out.println("k: "+mid);
            if(isValid(mid,piles,h))
            {
                ans = mid;
                high = mid - 1;
            }
            else
            low = mid + 1;
        }
        return ans;
    }
    public boolean isValid(int mid,int[] arr,int h)
    {
        long time = 0;

       for(int i = 0 ;  i < arr.length;i++)
       {
        time+= (long)Math.ceil(arr[i]/(double)mid);
       }
        return time<=h;
    }
}
