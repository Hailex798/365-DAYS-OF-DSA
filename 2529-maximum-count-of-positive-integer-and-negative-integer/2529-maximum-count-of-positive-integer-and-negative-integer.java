class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0, pos = 0;

        for(int i: nums){
            if(i > 0) pos++;
            else if(i < 0) neg++;
        }
        return pos > neg ? pos : neg;
    }
}