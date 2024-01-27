//OPTIMISED - 1(BINARY SEARCH)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int index = -1;
        
        //FIRST OCCURENCE
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target){
                index = mid;
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        ans[0] = index;
        
        //LAST OCCURENCE
        low = 0;
        high = len - 1;
        index = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target){
                index = mid;
                low = mid + 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }
        }
        ans[1] = index;
        
        return ans;
    }
}