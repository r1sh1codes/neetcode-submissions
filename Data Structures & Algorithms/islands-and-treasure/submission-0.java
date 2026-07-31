class Solution {
    boolean[][] visited;
    int rows,cols;
    int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    public void islandsAndTreasure(int[][] grid) {
        int land = Integer.MAX_VALUE;
        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        Queue<int[]> q= new LinkedList<>();
        for(int  i = 0 ; i <grid.length ; i++)
        {
            for(int j= 0; j < grid[0].length ; j++)
            {
                if(grid[i][j]== 0 && !visited[i][j])
                {
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }
        while(q.size()!=0)
        {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int[] temp:dir)
            {
                int i = temp[0];
                int j = temp[1];
                if(x+i < rows && x+i>=0 && y+j<cols && y+j>=0)
                {
                    if(!visited[x+i][y+j])
                    {
                        if(grid[x+i][y+j] == -1)
                        continue;
                        else if(grid[x+i][y+j]!=0)
                        {
                             visited[x+i][y+j] = true;
                            grid[x+i][y+j] = grid[x][y]+1;
                           
                            q.add(new int[]{x+i,y+j});
                        }
                    }
                }
            }

        }
      
    
    }
}
