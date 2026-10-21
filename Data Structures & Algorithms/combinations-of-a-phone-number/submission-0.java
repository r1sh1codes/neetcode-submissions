class Solution {
    List<String> res = new ArrayList<>();
    Map<Character,String> hm = new HashMap<>();
    public List<String> letterCombinations(String digits) {
            hm.put('2',"abc");
            hm.put('3',"def");
            hm.put('4',"ghi");
            hm.put('5',"jkl");
            hm.put('6',"mno");
            hm.put('7',"pqrs");
            hm.put('8',"tuv");
            hm.put('9',"wxyz");
            if(digits.equals(""))
            return res;
            
           
            StringBuilder sb= new StringBuilder("");
            int n = digits.length();
            String[] arr = new String[n];
             int idx = 0;
            for(char x:digits.toCharArray())
            arr[idx++] = hm.get(x);
            dfs(n,sb,arr,0);
            return res;
    }
    public void dfs(int n,StringBuilder sb,String[] arr,int idx)
    {
        if(idx == n)
        {
            // System.out.println(sb);
            res.add(new String(sb));
            return;
        }
        for(int i = 0 ; i < arr.length;i++)
        {
            String str = arr[i];
            for(char x:str.toCharArray())
            {
                if(i == idx){
                sb.append(x);
                dfs(n,sb,arr,idx+1);
                sb.deleteCharAt(sb.length()-1);
                }

            }
            
        }
    }
}
