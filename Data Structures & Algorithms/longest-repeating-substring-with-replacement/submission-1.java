class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int[] freq = new int[26];
        int maxlen = 0;
        for(int r = 0; r < n;r++)
        {   
            freq[s.charAt(r) - 'A']++;
            int maxf = 0;
            for(int i = 0 ; i < 26;i++)
            maxf = Math.max(maxf,freq[i]);
            while((r-l+1 - maxf) > k)
            {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
