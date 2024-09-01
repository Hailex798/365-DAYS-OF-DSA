//BRUTE FORCE - 1(DOUBLE-FOR)

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[0][0];
        if(m*n != original.length) return ans;
        ans = new int[m][n];
        
        int x = 0;
        
        for(int i=0 ; i<m ; i++){
            int[] temp = new int[n];
            for(int j=0 ; j<n ; j++){
                temp[j] = original[x++];
            }
            ans[i] = temp;
        }
        
        return ans;
    }
}