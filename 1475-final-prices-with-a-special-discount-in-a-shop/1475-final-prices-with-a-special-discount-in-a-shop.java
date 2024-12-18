class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] fPrice = new int[len];
        
        for(int i=0 ; i<len ; i++){
            int discount = 0;
            for(int j=i+1 ; j<len ; j++){
                if(prices[j] <= prices[i]){
                    discount = prices[j];
                    break;
                }
            }
            fPrice[i] = (prices[i] - discount);
        }
        
        return fPrice;
    }
}