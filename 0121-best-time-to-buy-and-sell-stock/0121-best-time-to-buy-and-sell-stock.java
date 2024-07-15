class Solution {
    public int maxProfit(int[] prices) {
        int minima = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0 ; i<prices.length ; i++){
            if(prices[i] < minima){
                minima = prices[i];
            }
            max = Math.max(max, prices[i] - minima);
        }
        
        return max;
    }
}