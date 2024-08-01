//OPTIMISED - 1(BASIC)

class Solution {
    public int countSeniors(String[] details) {
        int older = 0;
        
        for(String i: details){
            if(((i.charAt(11) - '0')*10 + (i.charAt(12) - '0')) > 60) older++;
        }
        
        return older;
    }
}