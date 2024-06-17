//OPTIMISED - 2(MATH LOGIC)

class Solution {
    public boolean judgeSquareSum(int c) {
        
        for(long i=0 ; i*i <= c ; i++){
            double b = (double)Math.sqrt(c - i*i);
            if(b == (int)b) return true;
        }
        
        return false;
    }
}