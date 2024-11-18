//BF - 1(BASIC ITERATION)

class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];
        
        if(k == 0) return new int[len];
        
        if(k > 0){
            for(int i=0 ; i<len ; i++){
                int val = 0;
                int limit = k;
                for(int j=i+1 ; limit-- > 0 ; j++){
                    val += code[j%len];
                }
                ans[i] = val;
            }
        }else{
            for(int i=0 ; i<len ; i++){
                int val = 0;
                int limit = Math.abs(k);
                for(int j=i-1 ; limit-- > 0 ; j--){
                    if(j == -1) j = len-1;
                    val += code[j];
                }
                ans[i] = val;
            }
        }
        
        return ans;
    }
}