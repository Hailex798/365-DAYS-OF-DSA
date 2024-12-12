class Solution {
    public long pickGifts(int[] gifts, int k) {
        long leftBehind = 0;
        
        while(k-- > 0){
            int idx = 0;
            int bigG = -1;
            for(int j=0 ; j<gifts.length ; j++){
                if(gifts[j] > bigG){
                    idx = j;
                    bigG = gifts[j];
                }
            }
            gifts[idx] = (int)Math.floor(Math.sqrt(gifts[idx]));
        }
        
        for(int i: gifts){
            leftBehind += i;
        }
        
        return leftBehind;
    }
}