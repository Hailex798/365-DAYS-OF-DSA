//OPTIMISED - 1(BACK-POINTER)

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i = 0;
        int p = happiness.length - 1;
        long sel = 0;
        
        while(k-- > 0 && happiness[p]-i > 0){
            sel += happiness[p--] - i;
            i++;
        }
        
        return sel;
    }
}