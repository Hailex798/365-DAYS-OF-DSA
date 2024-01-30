//OPTIMISED - 1(BINARY SEARCH : FIND PIVOT + 1 ELEMENT)

class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int pivot = -1;
        
        int low = 0;
        int high = len - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            //IF MID --> PIVOT
            if(mid < high && nums[mid] > nums[mid+1]){
                pivot = mid;
                break;
            }else if(mid > low && nums[mid] < nums[mid-1]){
                pivot = mid - 1;
                break;
            }
            
            //IF START & END --> SAME | MOVE 1 INDEX FROM BOTH ENDS
            if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                //IF START --> PIVOT
                if(low < high && nums[low] > nums[low+1]){
                    pivot = low;
                    break;
                }
                low++;
                
                //IF END --> PIVOT
                if(high > low && nums[high] < nums[high-1]){
                    pivot = high-1;
                    break;
                }
                high--;
            }
            //IF START IS SMALLER <<< MID --> START = MID + 1;
            else if(nums[low] < nums[mid] || (nums[low] == nums[mid] && nums[mid] > nums[high])){
                low = mid + 1;
            }
            //OPPOSITE
            else{
                high = mid - 1;
            }
        }
        
        return nums[(pivot+1)%len];
    }
}