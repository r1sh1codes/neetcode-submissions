class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen  = 0;
        int n  = s.length();
        int l = 0;
        Set<Character> hset = new HashSet<>();
        for(int r = 0;  r < n;r++)
        {
            while(hset.contains(s.charAt(r)))
            {
                hset.remove(s.charAt(l));
                l++;
            }
            hset.add(s.charAt(r));
            maxlen = Math.max(maxlen,r -l + 1);
        }
        return maxlen;
    }
}
