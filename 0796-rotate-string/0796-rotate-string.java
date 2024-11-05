//BF - 1(Check for Each Index)

class Solution {
    public boolean rotateString(String s, String goal) {
        int len1 = s.length();
        int len2 = goal.length();
        
        if(len1 != len2) return false;
        
        for(int i=0 ; i<len1 ; i++){
            int x = 0;
            for(int j=i ; j<len1 ; ){
                if(s.charAt(j) == goal.charAt(x)) j++;
                else break;
                
                if(j == len1 && x+1 != len2) j = 0;
                
                x++;
                if(x == len2) return true;
            }
        }
        
        return false;
    }
}