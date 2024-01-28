class Solution {
    public int countKeyChanges(String s) {
        int prevK = (int)s.charAt(0);
        int keys = 0;
        
        for(int i=1 ; i<s.length() ; i++){
            int currK = (int)s.charAt(i);
            if(currK != prevK && (currK > prevK ? prevK + 32 != currK : currK + 32 != prevK)){
                keys++;
                prevK = currK;
            }
        }
        
        return keys;
    }
}