class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
       int cnt = 0;
       while(true)
        {
            for(int i = 0;i<n;i++)
            {
                if(tickets[k]<=0)
                return cnt;
                else
                {
                    if(tickets[i] > 0){
                    cnt++;
                    tickets[i]--;
                    }
                }
            }
        }
        // return cnt;
    }

}