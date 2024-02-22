//BRUTE FORCE - 1(DOUBLE ITERATION: ONE PASS)

class Solution {
    public int findJudge(int n, int[][] trust) {
        
        for(int i=1 ; i<=n ; i++){
            boolean flag = true;
            int count = 0;
            for(int j=0 ; j<trust.length ; j++){
                if(i == trust[j][0]){
                    flag = false;
                    break;
                }
                if(i == trust[j][1]){
                    count++;
                }
            }
            if(flag == true && count == n-1){
                return i;
            }
        }
        
        return -1;
    }
}