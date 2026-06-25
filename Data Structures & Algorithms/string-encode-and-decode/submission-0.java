class Solution {
    StringBuilder sb = new StringBuilder("");
    public String encode(List<String> strs) {
        for(String x:strs)
        {
             sb.append(x.length());
             sb.append('#');
             sb.append(x);
        }
       
        return new String(sb);
    }

    public List<String> decode(String str) {
        List<String> res =  new ArrayList<>();
       
        int p = 0;
        while(p<str.length())
        {
            int q = p;
            while(str.charAt(q)!='#')
            q++;
        
        int len = Integer.parseInt(str.substring(p,q));
        res.add(str.substring(q+1,q+1+len));
        p = q+1+len;
        }
        return res;
    
    }
}
