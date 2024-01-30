//OPTIMISED - 1(BINARY SEARCH: PIVOT + DOUBLE BINARY SEARCH)

class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int pivot = pivot(nums);
        int left = binarySearch(nums, target, 0, pivot);
        if(left != -1) return left;
        int right = binarySearch(nums, target, pivot+1, len-1);
        return right;
    }
    //PIVOT INDEX
    public int pivot(int[] nums){
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
        return pivot;
    }
    
    public int binarySearch(int[] nums, int target, int low, int high){
        while(low <= high){
            int mid = low +(high-low)/2;
            
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return -1;
    }
}