//OPTIMISED - 1(BINARY SEARCH)

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            int val = guess(mid);
            
            if(val == 0) return mid;
            else if(val == 1) low = mid + 1;
            else high = mid - 1;
        }
        
        return low;
    }
}