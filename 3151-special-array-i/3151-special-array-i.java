//OPTIMISED - 1(BIT OP && POINTER)

class Solution {
    public boolean isArraySpecial(int[] nums) {
        int bit = nums[0] & 1;
        
        for(int i=1 ; i<nums.length ; i++){
            if(bit == (nums[i] & 1)) return false;
            else bit = nums[i] & 1;
        }
        
        return true;
    }
}