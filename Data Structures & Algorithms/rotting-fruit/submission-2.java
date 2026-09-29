class Solution{
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0 ; i < rows;i++)
        {
            for(int j = 0 ; j < cols ;j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1)
                fresh++;
            }
        }
        System.out.println(fresh);
        int time = 0;
        if(fresh == 0)
        return 0;

        while(q.size()!=0)
        {
            int n = q.size();
        
            while(n-- > 0)
            {
                int[] curr  = q.poll();
                
                int x = curr[0];
                int y = curr[1];
                System.out.println(x+"#"+y);
                for(int[] temp:dir)
                {
                    int i = temp[0];
                    int j=  temp[1];
                    if(x+i< rows && x+i>=0 && y+j < cols && y+j>=0)
                    {
                        if(grid[x+i][y+j] == 1)
                        {
                            fresh--;
                            if(fresh == 0)
                            return time+1;
                            q.add(new int[]{x+i,y+j});
                            grid[x+i][y+j] = 2;
                        }
                    }
                }    
                   
            }
            time++; 
        }
        for(int[] temp:grid)
        {
            for(int x:temp)
            System.out.print(x+" ");
            System.out.println();
        }
        return -1;
    }
}
