//BRUTE FORCE - 1(CONTEST: TWO FUNCTIONS)

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length;
        int both = 0;
        
        //CHECK FOR ALL POSSIBLE PAIRS OF SUFFIX AND PREFIX EQUALITY
        for(int i=0 ; i<len-1 ; i++){
            for(int j=i+1 ; j<len ; j++){
                if((prefix(words[i], words[j])) && (sufix(words[i], words[j]))){
                    both++;
                }
            }
        }
        
        return both;
    }
    
    public boolean prefix(String w1, String w2){
        int len = w1.length();
        if(len > w2.length()) return false;
        
        for(int i=0 ; i<len ; i++){
            if(w1.charAt(i) != w2.charAt(i)) return false;
        }
        return true;
    }
    
    public boolean sufix(String w1, String w2){
        int len1 = w1.length();
        int len2 = w2.length();
        
        for(int i=len2-len1, j=0 ; i<len2 ; i++, j++){
            if(w1.charAt(j) != w2.charAt(i)) return false;
        }
        return true;
    }
}