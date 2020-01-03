class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] a = new int[n][m];
        int count = 0;
        for(int[] b : indices)
        {
            int row = b[0];
            int col = b[1];
            for(int j = 0; j < m; j++){a[row][j] ^= 1;}
            for(int k = 0; k < n; k++){a[k][col] ^= 1;}
        }
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(a[i][j] == 1){count++;}
        
        return count;
    }
}