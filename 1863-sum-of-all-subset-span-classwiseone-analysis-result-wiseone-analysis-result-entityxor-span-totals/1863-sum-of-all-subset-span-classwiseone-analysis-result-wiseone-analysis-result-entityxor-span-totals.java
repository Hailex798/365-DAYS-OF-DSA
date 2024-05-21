//OPTIMISED - 2(BACKTRACKING)

class Solution {
    public int subsetXORSum(int[] nums) {
        return xor(nums, 0, 0);
    }
    public int xor(int[] nums, int idx, int xor){
        if(idx == nums.length) return xor;
        
        int withX = xor(nums, idx+1, xor ^ nums[idx]);
        
        int withoutX = xor(nums, idx+1, xor);
        
        return withX + withoutX;
    }
}