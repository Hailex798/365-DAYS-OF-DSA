//BF - 1(HINT INTUITION: 2 EVEN LENGTH PARTITION)

class Solution {
    public int minChanges(String s) {
        int change = 0;
        
        for(int i=1 ; i<s.length() ; i += 2){
            if(s.charAt(i) != s.charAt(i-1)) change++;
        }
        
        return change;
    }
}