class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //kahns ig,to detect cycle in a directed graph
        Queue<Integer>  q = new LinkedList<>();
        int[] outdegree = new int[numCourses];
        Map<Integer,List<Integer>> adj = new HashMap<>();
        for(int  i = 0;  i< numCourses;i++)
        adj.put(i,new ArrayList<>());

        for(int[] temp:prerequisites)
        {
            int u = temp[0];
            int v = temp[1];
            adj.get(v).add(u);
            outdegree[u]+=1;
        }
        int cnt = 0;
        for(int i = 0; i < numCourses;i++)
        {
            if(outdegree[i] == 0)
            q.add(i);
        }

        while(q.size()!=0)
        {
            
            int curr = q.poll();
            for(int v:adj.get(curr))
            {
                outdegree[v] = outdegree[v] - 1;
                if(outdegree[v] == 0)
                q.add(v);
            }
            cnt++;
        }
        System.out.println(cnt);
        return cnt == numCourses;
        // return cnt == numCourses;
    }
}
