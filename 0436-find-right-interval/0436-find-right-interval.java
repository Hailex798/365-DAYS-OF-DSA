//OPTIMISED - 1(CUSTOM SORT + BINARY SEARCH)

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int m = intervals.length;
        int[] rInt = new int[m];
        
        //Transfer main intervals arr -> new arr for their current position w/o sorting
        int[][] sortInt = new int[m][3];
        for(int i=0 ; i<m ; i++){
            sortInt[i][0] = intervals[i][0];
            sortInt[i][1] = intervals[i][1];
            sortInt[i][2] = i;
        }
        
        //Sort Array based on Start Index [0]
        Arrays.sort(sortInt,(a,b)->{
            return a[0]-b[0];
        });
        
        //Checking if END[i] has >= START[j]
        for(int i=0 ; i<m ; i++){
            rInt[i] = interval(sortInt, intervals[i][1]);
        }
        return rInt;
    }
    
    private int interval(int[][] sortInt, int target){
        int index = -1;
        int low = 0;
        int high = sortInt.length - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(sortInt[mid][0] < target){
                low = mid + 1;
            }else{
                index = mid;
                high = mid - 1;
            }
        }
        
        return index == -1 ? -1 : sortInt[index][2];
    }
}