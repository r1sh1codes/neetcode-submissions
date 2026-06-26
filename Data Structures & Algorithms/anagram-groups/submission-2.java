class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> hm = new HashMap<>();
       List<List<String>> res = new ArrayList<>();
       for(String str:strs)
       {
        int[] freq = new int[26];
        //convert
        for(char x:str.toCharArray())
        freq[x-'a']++;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<26;i++)
        {
            sb.append((char)(i+97));
            sb.append(freq[i]);
        }
        String hash = new String(sb);
        if(hm.containsKey(hash))
        {
            hm.get(hash).add(str);
        }
        else
        {
            hm.put(hash,new ArrayList<String>());
            hm.get(hash).add(str);
        }
        
       }
    
    for(String x:hm.keySet())
    res.add(hm.get(x));
    return res;
        
    }
}
