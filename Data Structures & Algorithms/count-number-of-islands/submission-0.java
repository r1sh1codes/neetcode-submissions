class Solution {
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
    int rows,cols;
    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int cc = 0;
        for(int i = 0; i < rows;i++)
        {
            for(int j=0 ; j < cols;j++)
            {
                if(grid[i][j] == '1')
                {
                    cc++;
                    dfs(grid,i,j);
                }
            }
        }
        return cc;
    }
    public void dfs(char[][] grid,int i,int j)
    {
        grid[i][j] = '0';
        for(int[] temp:dir)
        {
            int x = temp[0];
            int y = temp[1];
            if(x+i < rows && x+i>=0 && y+j<cols && y+j>=0 && grid[x+i][y+j] =='1')
            {
                dfs(grid,x+i,y+j);
            }
        }
    }
}
