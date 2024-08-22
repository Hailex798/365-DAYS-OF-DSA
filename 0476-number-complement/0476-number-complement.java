//OPTIMISED - 1(METHODS)

class Solution {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num);
        
        return num ^ (2*mask - 1);
    }
}