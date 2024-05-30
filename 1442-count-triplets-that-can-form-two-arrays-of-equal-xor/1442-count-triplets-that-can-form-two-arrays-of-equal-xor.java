//BF - 1(DOUBLE-FOR)

class Solution {
    public int countTriplets(int[] arr) {
        int len = arr.length;
        int score = 0;
        
        for(int q=0 ; q<len-1 ; q++){
            int xor = 0;
            for(int i=q+1 ; i<len ; i++){
                xor ^= arr[i-1];
                int xor2 = 0;
                for(int j=i ; j<len ; j++){
                    xor2 ^= arr[j];
                    if(xor == xor2){
                        score++;
                    }
                }
            }
        }
        
        return score;
    }
}