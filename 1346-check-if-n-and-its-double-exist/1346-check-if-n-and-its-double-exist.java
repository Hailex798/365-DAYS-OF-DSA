//OP - 1(SORTING + BINARY SEARCH)

class Solution {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        
        Arrays.sort(arr);
        
        for(int i=0 ; i<len ; i++){
            if(binarySearch(arr, arr[i]*2, i)) return true; 
        }
        
        return false;
    }
    
    public boolean binarySearch(int[] arr, int target, int index){
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] == target) return mid != index;
            else if(arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return false;
    }
}