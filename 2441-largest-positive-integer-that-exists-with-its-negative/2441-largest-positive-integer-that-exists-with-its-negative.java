//BRUTE FORCE - 1(SORTING)

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        
        int i = 0;
        int j = nums.length - 1;
        
        while(i<j){
            if(nums[i] < 0 && nums[j] == Math.abs(nums[i])) return nums[j];
            else if(nums[j] > Math.abs(nums[i])) j--;
            else i++;
        }
        
        return -1;
    }
}