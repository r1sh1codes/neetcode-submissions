class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())
        return false;
        int k =  s1.length();
        int[] f1 = new int[26];
        for(char x:s1.toCharArray())
        f1[x-'a']++;
        int[] f2 = new int[26];
        for(int i =  0;i < k;i++)
        {
            f2[s2.charAt(i) - 'a']++;
        }
        if(isValid(f1,f2))
        return true;
    for(int i  = k;i< s2.length();i++)
    {
        f2[s2.charAt(i)-'a']++;
        f2[s2.charAt(i-k) -'a']--;
        if(isValid(f1,f2))
        return true;
    }
    return false;
    }
    public boolean isValid(int[] f1,int[] f2)
    {
        for(int i = 0;i<26;i++)
        {
            if(f1[i]!=f2[i])
            return false;
        }
        return true;
    }
}
