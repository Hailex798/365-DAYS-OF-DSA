//OPTIMISED - 1(GREEDY + SORTING)

class Solution {
    public int minDifference(int[] nums) {
        int len = nums.length;
        
        if(len <= 4) return 0;
        
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
        
        for(int left = 3, right = len-1 ; left >= 0 ; left--, right--){
            minDiff = Math.min(minDiff, nums[right] - nums[left]);
        }
        
        return minDiff;
    }
}