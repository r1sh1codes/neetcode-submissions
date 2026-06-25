class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        prefix = new int[matrix.length+1][matrix[0].length+1];
        for(int i  =1; i<= matrix.length;i++)
        {
            for(int j = 1 ; j <=matrix[0].length;j++)
            {
                prefix[i][j] = matrix[i-1][j-1]+ prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }
        for(int[] temp:prefix)
        {
            for(int x:temp)
            System.out.print(x+" ");
            System.out.println();
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int pfr1 = row1+1,pfc1 = col1+1;
        int pfr2 = row2+1,pfc2 = col2+1;
        return prefix[pfr2][pfc2] - prefix[pfr1 - 1][pfc2] - prefix[pfr2][pfc1-1] + prefix[pfr1-1][pfc1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */