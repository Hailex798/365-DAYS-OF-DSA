//OPTIMISED - 1(BACK POINTER)

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long h = 0;
        int len = happiness.length;
        Arrays.sort(happiness);
        long x = 0;
        
        int i = len-1;
        while(k > 0 && i >= 0){
            if(happiness[i] - x > 0){
                h += happiness[i] - x;
                x++;
                i--;
                k--;
            }else{
                return h;
            }
        }
        
        return h;
    }
}