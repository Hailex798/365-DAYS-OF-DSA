//OPTIMISED - 1(DYNAMIC PROGRAMMING)

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] i: dp) Arrays.fill(i, -1);
        
        return paths(0, 0, dp, m, n);
    }
    public int paths(int m, int n, int[][] dp, int row, int col){
        if(m >= row || n >= col) return 0;
        if(m == row-1 && n == col-1) return 1;
        if(dp[m][n] != -1) return dp[m][n];
        
        return dp[m][n] = paths(m+1, n, dp, row, col) + paths(m, n+1, dp, row, col);
    }
}