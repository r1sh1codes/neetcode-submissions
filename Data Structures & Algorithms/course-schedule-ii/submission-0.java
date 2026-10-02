class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> adj = new  HashMap<>();
        int[] res = new int[numCourses];
        int[] od = new int[numCourses];
        for(int i =  0; i <numCourses;i++)
        adj.put(i,new ArrayList<>());
        for(int[] temp:prerequisites)
        {
            int u = temp[0];
            int v = temp[1];
            adj.get(v).add(u);
            od[u]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses;i++)
        {
            if(od[i] == 0)
            q.add(i);
        }
        int cnt = 0;
        int idx = 0;
        while(q.size()!=0)
        {
            int curr = q.poll();
            res[idx++] = curr;
            for(int v:adj.get(curr))
            {
                od[v]-=1;
                if(od[v] == 0)
                q.add(v);
            }
            cnt++;
        }
        System.out.println(cnt);
        if(cnt == numCourses)
            return res;
        else
        return new int[0];
    }
}
