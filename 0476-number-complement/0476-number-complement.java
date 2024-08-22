//OPTIMISED - 2(METHODS...)

class Solution {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num);
        
        mask |= (mask-1);
        
        return num ^ mask;
    }
}