class Solution {
    public int minOperations(int[] nums) {
        int minFlips = 0;
        int len = nums.length;

        for(int i=0 ; i<len-2 ; i++){
            if(nums[i] == 0){
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
                
                minFlips++;
            }
        }

        return nums[len-1] == 1 && nums[len-2] == 1 ? minFlips : -1;
    }
}