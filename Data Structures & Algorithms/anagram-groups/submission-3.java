class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> hm=  new HashMap<>();
        for(String str:strs)
        {
            int[] freq = new int[26];
            for(char x:str.toCharArray())
            freq[x-'a']++;
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < 26;i++)
            sb.append(freq[i]+" ");
            String hash = new String(sb);
            if(hm.containsKey(hash))
            {
                hm.get(hash).add(str);
            }
            else
            {
                hm.put(hash,new ArrayList<>());
                hm.get(hash).add(str);
            }
            // System.out.println(str+" "+hash);
        }
        for(String k:hm.keySet())
        {
            List<String> temp = hm.get(k);
            // for(String y:temp)
            // System.out.print(y+" ");
            // System.out.println();
            res.add(temp);
        }
        return res;
    }
}
