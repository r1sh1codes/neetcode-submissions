class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
        return false;
        int  k = s1.length();
        int[] freq = new int[26];
        for(int i = 0; i < k;i++)
        freq[s1.charAt(i)-'a']+=1;
        int[] freq1 = new int[26];
        for(int i = 0; i < k;i++)
        freq1[s2.charAt(i)-'a']+=1;
        if(isEqual(freq,freq1))
            return true;
        int n = s2.length();
        for(int i =k;i < n;i++)
        {
            freq1[s2.charAt(i)-'a']+=1;
            freq1[s2.charAt(i-k)-'a']-=1;
            if(isEqual(freq,freq1))
            return  true;
        }
        return false;
    }
    public boolean isEqual(int[] a,int[] b)
    {
        for(int i = 0; i < 26;i++)
        {
            if(a[i]!=b[i])
            return false;
        }
        return true;
    }
}
