//OPTIMISED - 1(SORTING)

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        
        for(int x=1 ; x<=len ; x++){
            int low = 0;
            int high = nums.length - 1;
            int index = -1;

            //FINDING THE FIRST OCCURRENCE
            while(low <= high){
                int mid = low + (high-low)/2;

                if((mid == 0 || nums[mid-1] < x) && nums[mid] == x){
                    index = mid;
                    break;
                }else if(nums[mid] < x){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            if(index == -1) index = low;
            
            if(len-index == x) return x;
        }
        
        return -1;
    }
}