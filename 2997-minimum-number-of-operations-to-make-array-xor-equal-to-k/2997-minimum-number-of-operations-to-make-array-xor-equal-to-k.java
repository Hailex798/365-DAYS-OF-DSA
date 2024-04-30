//OPTIMISED - 1(SHIFTING + XOR)

class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        int min = 0;
        
        for(int i: nums) xor ^= i;
        
        for(int i=0 ; i<32 ; i++){
            if((xor & 1) != (k & 1)) min++;
            xor >>= 1; k >>= 1;
        }
        
        return min;
    }
}