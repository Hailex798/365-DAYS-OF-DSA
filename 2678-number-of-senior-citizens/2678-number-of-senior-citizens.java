class Solution {
    public int countSeniors(String[] details) {
        int older = 0;
        String age = "";
        
        for(String i: details){
            age += i.charAt(11);
            age += i.charAt(12);
            if(Integer.valueOf(age) > 60) older++;
            
            age = "";
        }
        
        return older;
    }
}