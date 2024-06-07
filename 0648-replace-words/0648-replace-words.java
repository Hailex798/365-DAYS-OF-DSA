//BRUTE FORCE - 1(DOUBLE-PASS)

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr = null;
        arr = sentence.split(" ");
        
        //SORTING DICTIONARY BASED ON WORDS LENGTH
        dictionary.sort((s1, s2) -> s1.length() - s2.length());
        
        //CHECKING FOR THE ROOT WORD
        for(int i=0 ; i<arr.length ; i++){
            for(String dic: dictionary){
                int tLen = dic.length();
                if(arr[i].length() < tLen){
                    continue;
                }
                String temp = arr[i].substring(0, tLen);
                if(temp.equals(dic)){
                    arr[i] = dic;
                    break;
                }
            }
        }
        
        //GETTING ARRAY OF STRINGS -> STRING
        sentence = String.join(" ", arr);
        return sentence;
    }
}