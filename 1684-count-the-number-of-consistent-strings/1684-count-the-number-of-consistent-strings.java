//OPTIMISED - 1(HASHSET1.EQUALS(HASHSET21))

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set1 = new HashSet<>();
        int consistent = 0;
        
        //OG HASHET DATA MAPPING
        for(char c: allowed.toCharArray()){
            set1.add(c);
        }
        
        for(String s: words){
            Set<Character> set2 = new HashSet<>();
            for(char c: s.toCharArray()){
                set2.add(c);
            }
            if(set1.containsAll(set2) || set1.equals(set2)) consistent++;
        }
        
        return consistent;
    }
}