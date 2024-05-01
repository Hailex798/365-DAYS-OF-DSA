//OPTIMISED - 1(TWO-POINTERS)

class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] maxLeft = new int[len];
        maxLeft[0] = height[0];
        int[] maxRight = new int[len];
        maxRight[len-1] = height[len-1];
        
        //STORING MAXLEFT + MAXRIGHT
        for(int i=1, j=len-2 ; i<len ; i++, j--){
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
            maxRight[j] = Math.max(height[j], maxRight[j+1]);
        }
        
        int water = 0;
        for(int i=0 ; i<len ; i++){
            water += Math.max(0, Math.min(maxLeft[i], maxRight[i]) - height[i]);
        }
        
        return water;
    }
}