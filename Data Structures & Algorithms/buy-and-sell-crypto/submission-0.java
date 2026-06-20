class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int maxp = 0;
        int n = prices.length;
        int r = 0;;
        while(r<n)
        {
            if(prices[r] - prices[l] > 0)
            {
                maxp = Math.max(maxp,prices[r] - prices[l]);
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
