class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> hm = new HashMap<>();
       for(String str:strs)
       {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);

        String temp1 = new String(temp);
        System.out.println(temp1);
        if(hm.containsKey(temp1))
        {
            hm.get(temp1).add(str);
        }
        else
        {
            hm.put(temp1,new ArrayList<String>());
            hm.get(temp1).add(str);
        }
       }
       List<List<String>> res = new ArrayList<>();
       for(String str:hm.keySet())
       {    
        res.add(hm.get(str));
       }
    //    return new ArrayList<List<String>>();
    return res;
        
    }
}
