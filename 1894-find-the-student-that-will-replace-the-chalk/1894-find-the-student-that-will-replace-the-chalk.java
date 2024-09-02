//OPTIMISED - 2(MODULO FN)

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int tot = 0;
        
        //CALCULATING TOTAL SUM
        int sum = 0;
        for(int i=0 ; i<chalk.length ; i++){
            sum += chalk[i];
            if(sum > k) return i;
        }
        
        k = k % sum;
        
        for(int i=0 ; i<chalk.length ; i++){
            tot += chalk[i];
            
            if(tot > k) return i;
        }
        
        return -1;
    }
}