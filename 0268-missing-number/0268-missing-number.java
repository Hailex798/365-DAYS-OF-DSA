//OPTIMISED - 1(SUM OF N NATURAL NO.)

class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        
        
        return (len*(len+1)/2) - Arrays.stream(nums).sum();
    }
}