//OPTIMISED - 1(DP: MEMOIZATION)

class Solution {
    public int minInsertions(String s) {
        int m = s.length();
        int[][] dp = new int[m+1][m+1];
        
        for(int[] i: dp){
            Arrays.fill(i, -1);   
        }
        
        int ans = solve(s, 0, m-1, dp);
        
        return ans;
    }
    
    public int solve(String s, int i, int j, int[][] dp){
        if(i >= j){
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = solve(s, i+1, j-1, dp);
        }
        
        return dp[i][j] = 1 + Math.min(solve(s, i+1, j, dp), solve(s, i, j-1, dp));
    }
}