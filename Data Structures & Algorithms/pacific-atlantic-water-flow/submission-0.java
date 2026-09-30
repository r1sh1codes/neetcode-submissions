class Solution {
    int[][] dir ={{0,1},{1,0},{-1,0},{0,-1}};
    int rows,cols;
      boolean[][] visited;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        //dfs from first row(pacific)
         rows = heights.length;
         cols = heights[0].length;
    
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic  = new boolean[rows][cols];
      visited = new boolean[rows][cols];

            
            for(int i = 0; i < cols; i++) {
                if(!visited[0][i])
                    dfs(visited, pacific, heights, 0, i);
            }

        
            for(int i = 0; i < rows; i++) {
                if(!visited[i][0])
                    dfs(visited, pacific, heights, i, 0);
            }

          
            visited = new boolean[rows][cols];

         
            for(int i = 0; i < cols; i++) {
                if(!visited[rows-1][i])
                    dfs(visited, atlantic, heights, rows-1, i);
            }

            
            for(int i = 0; i < rows; i++) {
                if(!visited[i][cols-1])
                    dfs(visited, atlantic, heights, i, cols-1);
            }
        for(int i  = 0 ; i < rows;i++)
        {
            for(int j = 0; j < cols;j++)
            {
                if(pacific[i][j] == true && atlantic[i][j] == true)
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
            }
        }
        return res;
    }
    public void dfs(boolean[][] visited,boolean[][] ocean,int[][] grid,int i, int j)
    {
        visited[i][j] = true;
        // pac.add(new int[]{i,j});
        ocean[i][j] = true;
        for(int[] temp:dir)
        {
            int x = temp[0];
            int y = temp[1];
            if(x + i < rows && x+i>=0 && y+j < cols && y+j>=0)
            {
                if(grid[x+i][y+j] >= grid[i][j] && !visited[x+i][y+j])
                {
                    dfs(visited,ocean,grid,x+i,y+j);
                }
            }
        }
    }
}
