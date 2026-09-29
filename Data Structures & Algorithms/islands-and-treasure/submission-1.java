class Solution {
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < rows;i++)
        {
            for(int j = 0; j < cols;j++)
            {
                if(grid[i][j] == 0)
                {
                    q.add(new int[]{i,j});
                }
            }
        }
        int d = 0;
        while(q.size()!=0)
        {
            int n = q.size();
            d++;
            while(n-- > 0)
            {
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];
                for(int[] temp:dir)
                {
                    int i = temp[0];
                    int j = temp[1];
                    if(x+i>=0 && x+i < rows && y+j<cols && y+j>=0)
                    {
                        if(grid[x+i][y+j] == Integer.MAX_VALUE)
                        {
                            grid[x+i][y+j] = d;
                            q.add(new int[]{x+i,y+j});
                        }
                    }
                }
            }
        }
        // return grid;
    }
}
