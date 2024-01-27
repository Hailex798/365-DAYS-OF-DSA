//OPTIMISED - 1(BINARY SEARCH -> KK'S WAY)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        
        return ans;
    }
    
    private int search(int[] nums, int target, boolean searchFirstIndex){
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target){
                index = mid;
                if(searchFirstIndex){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return index;
    }
}