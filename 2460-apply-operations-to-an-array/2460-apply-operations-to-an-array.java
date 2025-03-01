class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        for(int i=0 ; i<len-1 ; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        for(int i=0, j=0 ; i<len ; i++){
            if(nums[i] > 0){
                result[j++] = nums[i];
            }
        }

        return result;
    }
}