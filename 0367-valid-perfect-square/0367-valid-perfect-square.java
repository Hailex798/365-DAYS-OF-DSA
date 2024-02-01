//OPTIMISED - 1(BINARY SEARCH)

class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        
        while(low <= high){
            long mid = (int)low + (high-low)/2;
            long val = mid*mid;
            
            if(val == num) return true;
            else if(val < num) low = (int)mid + 1;
            else high = (int)mid - 1;
        }
        
        return low * low == num ? true : false;
    }
}