//BF - 1(STRING SPLIT METHOD)

class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] splited = sentence.split("\\s+");
        int len = splited.length;
        
        for(int i=1 ; i<len ; i++){
            String first = splited[i-1];
            String second = splited[i];
            
            if(first.charAt(first.length() - 1) != second.charAt(0)) return false;
        }
        
        if(splited[0].charAt(0) != splited[len-1].charAt(splited[len-1].length() - 1)) return false;
        
        return true;
    }
}