//BF - 1(CHECKING ITERATIVELY)

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        
        int len = searchWord.length();
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i].length() < len) continue;
            
            int x = 0;
            boolean flag = true;
            for(char c: searchWord.toCharArray()){
                if(c != arr[i].charAt(x)){
                    flag = false;
                    break;
                }
                x++;
            }
            if(flag) return i+1;
        }
        
        return -1;
    }
}