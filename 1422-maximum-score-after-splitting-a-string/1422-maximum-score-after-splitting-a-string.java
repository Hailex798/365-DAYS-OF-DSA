//OP - 1(BASIC ITERATION)

class Solution {
    public int maxScore(String s) {
        int leftZeroes = 0;
        int maxScore = 0;

        for(int i=0 ; i<s.length()-1 ; i++){
            if(s.charAt(i) == '0') leftZeroes++;
            int rightZeroes = 0;
            for(int j=i+1 ; j<s.length() ; j++){
                rightZeroes += (s.charAt(j) - '0');
            }
            maxScore = Math.max(maxScore, leftZeroes + rightZeroes);
        }

        return maxScore;
    }
}