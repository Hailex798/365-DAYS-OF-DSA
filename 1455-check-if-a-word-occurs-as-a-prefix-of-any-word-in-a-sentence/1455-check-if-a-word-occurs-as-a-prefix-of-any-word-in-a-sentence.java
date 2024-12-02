//OP - 1(STARTSWITH METHOD)

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        
        int len = searchWord.length();
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i].length() < len) continue;
            
            if(arr[i].startsWith(searchWord)) return i+1;
        }
        
        return -1;
    }
}