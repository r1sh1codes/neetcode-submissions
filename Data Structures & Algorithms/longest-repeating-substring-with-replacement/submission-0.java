class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        int  l = 0;
        int[] freq = new int[26];
        for(int r = 0;r< s.length();r++)
        {
            freq[s.charAt(r) - 'A']++;
            int maxfreqcnt = 0;
            for(int x:freq)
            maxfreqcnt = Math.max(x,maxfreqcnt);
            // int windowsize = r - l + 1;
            while(l<n && k + maxfreqcnt < r-l+1)
            {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
