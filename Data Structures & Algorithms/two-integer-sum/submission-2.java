class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i =  0; i < nums.length;i++)
        {
            if(hmap.containsKey(target - nums[i]))
            {
                int[] res = new int[2];
                res[0] =  hmap.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            hmap.put(nums[i],i);
        }
        return new int[2];
    }
}
