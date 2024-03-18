//OPTIMISED - 1(INTERVALS ??)

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> (a[1] - b[1]));
        int minArrow = 1;
        int len = points.length;
        
        for(int i=0, j=i+1 ; j<len ; ){
            if(j < len && (points[j][0] <= points[i][1] && points[i][1] <= points[j][1])){
                j++;
            }else{
                minArrow++;
                i = j;
            }
        }
        
        return minArrow;
    }
}