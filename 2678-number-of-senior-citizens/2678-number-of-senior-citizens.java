//OPTIMISED - 1(BASIC)

class Solution {
    public int countSeniors(String[] details) {
        int older = 0;
        
        for(String i: details){
            int x = Integer.valueOf(i.charAt(11) - '0');
            x = x*10 + Integer.valueOf(i.charAt(12) - '0');
            System.out.println(x);
            if(x > 60) older++;
        }
        
        return older;
    }
}