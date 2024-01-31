//OPTIMISED - 1(BINARY SEARCH: FIRST LARGER ELEMENT)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0;
        int high = m - 1;
        int idx = 0;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(matrix[mid][0] == target) return true;
            else if(matrix[mid][0] < target){
                idx = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        
        //COLUMN-ARRAY BINARY SEARCH
        int[] temp = new int[n];
        for(int i=0 ; i<n ; i++){
            temp[i] = matrix[idx][i];
        }
        
        return binarySearch(temp, target) == -1 ? false : true;
    }
    
    private int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return -1;
    }
}