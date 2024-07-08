class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0;
        int extra = 0;
        int bott = 0;
        
        while(numBottles > 0){
            sum += numBottles;
            numBottles += extra;
            bott = numBottles;
            numBottles /= numExchange;
            extra = bott % numExchange;
        }
        
        return sum;
    }
}