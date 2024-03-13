//OPTIMISED - 1(TWO POINTER)

class Solution {
    public int pivotInteger(int n) {
        int i = 1;
        int j = n;
        int lSum = i;
        int rSum = j;
        
        while(i < j){
            if(rSum > lSum){
                i++;
                lSum += i;
            }else{
                j--;
                rSum += j;
            }
        }
        
        return rSum == lSum ? i : -1;
    }
}