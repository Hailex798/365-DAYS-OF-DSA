//OPTIMISED - 1(MINIMA + MAXIMA)

class Solution {
    public int maxProfit(int[] prices) {
        int minima = prices[0];
        int maxima = Integer.MIN_VALUE;
        
        for(int i=0 ; i<prices.length ; i++){
            if(prices[i] < minima) minima = prices[i];
            
            maxima = Math.max(maxima, prices[i] - minima);
        }
        
        return maxima;
    }
}