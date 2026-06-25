class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hmap = new HashMap<>();
        int n  = nums.length;
        int[] prefix= new int[n];
        prefix[0] =nums[0];
        for(int i  =1; i < n;i++)
        prefix[i] = prefix[i-1] + nums[i];
        int c = 0;
        for(int i  = 0; i < n;i++)
        {
            if(prefix[i] == k)
            c++;
            
                if(hmap.containsKey(prefix[i]-k))
                c+= hmap.get(prefix[i]-k);
               
            
             hmap.put(prefix[i],hmap.getOrDefault(prefix[i],0)+1);
        }
        return c;
    }
}