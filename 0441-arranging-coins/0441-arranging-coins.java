//OPTIMISED - 1(BINARY SEARCH + SUM OF N NATURAL NO.)

class Solution {
    public int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        
        while(low <= high){
            long k = low + (high-low)/2;
            long mid = k*(k+1)/2;
            
            if(mid == n) return (int)k;
            else if(mid < n) low = k + 1;
            else high = k - 1;
        }
        
        return (int)high;
    }
}