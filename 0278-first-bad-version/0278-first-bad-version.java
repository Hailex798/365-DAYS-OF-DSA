//OPTIMISED - 1(BINARY SEARCH: FIRST OCCURENCE)

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int idx = 0;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            boolean val = isBadVersion(mid);
            
            if(val == true){
                idx = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return idx;
    }
}