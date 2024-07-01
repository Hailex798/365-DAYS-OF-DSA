//OPTIMISED - 1(BITWISE OP + ITERATING)

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd = 0;
        
        for(int i=0 ; i<arr.length ; i++){
            if((arr[i]&1) == 1) odd++;
            else odd = 0;
            
            if(odd == 3) return true;
        }
        
        return false;
    }
}