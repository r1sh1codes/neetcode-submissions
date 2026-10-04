class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int idx = 0;
        for(int i = 0 ; i <n;i++)
        {
            //make space for nums[i]
            while(!dq.isEmpty() && dq.peekFirst()<= i-k)
            {
                dq.pollFirst();
            }
            //if nums[i] greater pop
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.addLast(i);
            if(i >= k-1)
            res[idx++] = nums[dq.peekFirst()];

        }
        return res;
    }
}
