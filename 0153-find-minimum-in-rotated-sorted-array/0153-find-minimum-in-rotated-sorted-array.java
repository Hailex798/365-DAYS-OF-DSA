//OPTIMISED - 1(BINARY SEARCH : FIND PIVOT + 1 ELEMENT)

class Solution {
    public int findMin(int[] nums) {
        int pivot = -1;
        int len = nums.length;
        
        int low = 0;
        int high = len - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(mid < high && nums[mid] > nums[mid+1]){
                pivot = mid;
                break;
            }else if(mid > low && nums[mid-1] > nums[mid]){
                pivot = mid - 1;
                break;
            }else if(nums[mid] > nums[low]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return nums[(pivot+1)%len];
    }
}