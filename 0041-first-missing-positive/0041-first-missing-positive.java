//OPTIMISED - 1(SWAPPING VALID INDEX: CHECKING 1st NON-MATCHABLE VALUE)

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        //swapping valid values with their indexes
        int i=0;
        for(i=0 ; i<nums.length ;){
            if(nums[i] > 0 && nums[i] < nums.length && nums[nums[i]-1] != nums[i]){
                swap(nums, i, nums[i]-1);
            }else i++;
        }
        
        //checking the 1st invalid value which doesn't matches it's index
        for(i=0 ; i<nums.length ; i++){
            if(nums[i] != i+1) return i+1;
        }
        return i+1;
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}