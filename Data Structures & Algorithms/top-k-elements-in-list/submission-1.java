class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        PriorityQueue<Integer> minh = new PriorityQueue<>((a,b) -> hm.get(a) - hm.get(b));
        for(int x:nums)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int x:hm.keySet())
        {
            minh.add(x);
            if(minh.size() > k)
            {
                
                minh.poll();
            }
        }
        int idx = 0;
        int[] res = new int[k];
        while(minh.size()!=0)
        res[idx++] = minh.poll();
    return res;
    }
    
}
