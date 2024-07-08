//OPTIMISED - 1(BINARY SEARCH) 

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int low = 0;
        int high = len - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(letters[mid] <= target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return letters[low%len];
    }
}