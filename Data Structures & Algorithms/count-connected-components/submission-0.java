class Solution {
    int res = 0;
    boolean[] visited;
    Map<Integer,List<Integer>> adj;
    public int countComponents(int n, int[][] edges) {
            visited = new boolean[n];
            adj = new HashMap<>();
            for(int i = 0 ; i  < n;i++)
            {
                adj.put(i,new ArrayList<>());
            }
            for(int[] temp:edges)
            {
                adj.get(temp[0]).add(temp[1]);
                adj.get(temp[1]).add(temp[0]);
            }
        for(int i = 0 ; i < n;i++)
        {
            if(!visited[i])
            {
                dfs(i);
                res++;
            }
         
        }
        return res;
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
