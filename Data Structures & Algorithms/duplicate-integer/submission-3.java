class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> hset = new HashSet<>();
      for(int x:nums)
      {

        if(hset.contains(x))
        return true;
        hset.add(x);
      }
      return false;

    }
}