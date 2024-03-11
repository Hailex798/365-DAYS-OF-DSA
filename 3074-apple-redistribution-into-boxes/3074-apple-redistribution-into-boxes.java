//BRUTE FORCE - 1(SORTING)

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        
        //TOTAL NO. OF APPLES
        for(int i: apple){
            total += i;
        }
        
        //TOTAL BOXES
        Arrays.sort(capacity);
        int cap = 0;
        for(int i=capacity.length-1 ; i>=0 ; i--){
            total -= capacity[i];
            cap++;
            if(total <= 0){
                return cap;
            }
        }
        return cap;
    }
}