class Solution {
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
    int rows,cols;
    public int maxAreaOfIsland(int[][] grid) {
         int max = 0;
         rows = grid.length;
         cols = grid[0].length;
        for(int i = 0 ; i  < rows; i++)
        {
            for(int j = 0 ; j < cols ;j++)
            {
                if(grid[i][j] == 1)
                {
                    max = Math.max(bfs(grid,i,j),max);
                }
            }
        }
        return max;
    }
    public int bfs(int[][] grid,int i , int j)
    {
        int size  =1;
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{i,j});
        grid[i][j] = 0;
        while(q.size()!=0)
        {
            int[] curr = q.poll();
            
            int xi = curr[0];
            int yj = curr[1];
            
                for(int[] temp:dir)
            {
                int x = temp[0];
                int y = temp[1];
                if(x+xi < rows && x+xi>=0 && y+yj<cols && y+yj>=0 && grid[x+xi][y+yj] == 1)
                {
                    size++;
                    grid[x+xi][y+yj] = 0;
                    q.add(new int[]{x+xi,y+yj});
                }
            }

        }
        return size;
       
    }
}
