//OPTIMISED - 1(BASIC SORTING)

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int minDiff = Integer.MAX_VALUE;
        int len = timePoints.size();
        List<Integer> timePoint = new ArrayList<>();
        
        //CONVERTING STRING TO MINUTES
        for(int i=0 ; i<len ; i++){
            int fHr = Integer.parseInt(timePoints.get(i).substring(0, 2));
            int fMi = Integer.parseInt(timePoints.get(i).substring(3));
            
            timePoint.add(fHr*60 + fMi);
        }
        
        Collections.sort(timePoint);
        
        //CHECKING ADJACENT TIME DIFF
        for(int i=1 ; i<len ; i++){
            minDiff = Math.min(minDiff, timePoint.get(i) - timePoint.get(i-1));
        }
        
        return Math.min(minDiff, 24*60 - timePoint.get(len-1) + timePoint.get(0));
    }
}