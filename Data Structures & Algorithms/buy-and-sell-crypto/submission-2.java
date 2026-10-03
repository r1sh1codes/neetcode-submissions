class Solution {
    public int maxProfit(int[] prices) {
        int l = 0,r = 1;
        int n = prices.length;
        int maxp = 0;
        while(r< n)
        {
            int profit = prices[r] - prices[l];
            if(profit > 0)
            {
                maxp = Math.max(maxp,profit);
            }
            else
            {
                l = r;
            }
            r++;
        }
        return maxp;
    }
}
