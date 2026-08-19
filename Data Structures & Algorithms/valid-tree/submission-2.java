class Solution {
   
    // 
    Map<Integer,List<Integer>> adj;
    boolean[] visited;
    int cc = 0;
    
    public boolean validTree(int n, int[][] edges) {
        
         adj = new HashMap<>();
         for(int i = 0;i < n;i++)
       adj.put(i,new ArrayList<>());
         for(int[] temp:edges)
         {
            int u = temp[0];
            int v = temp[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
         }
        visited = new boolean[n];
         for(int i = 0 ; i< n;i++)
         {
            if(!visited[i])
            {
                dfs(i);
                cc++;
            }
         }
    int v = n;
    System.out.println(v);
    int e = edges.length;
    System.out.println(e);
    System.out.println(cc);
     return cc == 1 && edges.length == n - 1;
    }
    public void dfs(int u)
    {
      visited[u] = true;
      for(int v:adj.get(u))
      {
        if(!visited[v])
        dfs(v);
      }
    }
}
