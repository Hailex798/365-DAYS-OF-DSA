//OP - 1(No Split: Direct Iterate & Check)

class Solution {
    public boolean isCircularSentence(String sentence) {
        int len = sentence.length();
        
        if(sentence.charAt(0) != sentence.charAt(len-1)) return false;
        
        for(int i=0 ; i<len ; i++){            
            if(sentence.charAt(i) == ' ' && sentence.charAt(i-1) != sentence.charAt(i+1)) return false;
        }
        
        return true;
    }
}