//BRUTE FORCE - 1(TWO POINTERS)

class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        int count = 0;
        
        for(int i=0 ; i<len ; i++){
            //FOR ODD INDEXES
            int left = i;
            int right = i;
            
            while(left >= 0 && right < len){
                if(s.charAt(left) == s.charAt(right)){
                    count++;
                    left--;
                    right++;
                }else{
                    break;
                }
            }
            
            //FOR EVEN INDEXES
            int low = i;
            int high = i+1;
            while(low >= 0 && high < len){
                if(s.charAt(low) == s.charAt(high)){
                    count++;
                    low--;
                    high++;
                }else{
                    break;
                }
            }
        }
        
        return count;
    }
}