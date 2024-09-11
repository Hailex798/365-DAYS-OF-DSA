class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        
        for(int i=0 ; i<32 ; i++){
            if((start&1) != (goal&1)) flips++;
            
            start >>= 1;
            goal >>= 1;
        }
        
        return flips;
    }
}