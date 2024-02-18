//OPTIMISED - 1(CONTEST: HASHMAP<CHARACTER, LIST<INTEGER>>)

class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        
        //CREATING HASHMAP OF CHARACTER: {ARRAYLIST(INDEXES)}
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            List<Integer> temp = map.getOrDefault(c, new ArrayList<>());
            temp.add(i);
            map.put(c, temp);
        }
        
        //FINDING MAX LENGTH OCCURENCE OF LETTERS (LAST STRING)
        int max = Integer.MIN_VALUE;
        for(char key: map.keySet()){
            if(map.get(key).size() > max){
                max = map.get(key).size();
            }
        }
        
        Arrays.fill(freq, -1);
        //STORING VALUE OF LAST STRING INDEXES
        for(char i: map.keySet()){
            if(map.get(i).size() == max){
                freq[i - 'a'] = map.get(i).get(max - 1);
            }
        }
        
        String last = "";
        int occ = 0;
        //FIND TOTAL CHARACTERS IN LAST STRING
        for(int i=0 ; i<26 ; i++){
            if(freq[i] > -1) occ++;
        }
        //CREATING THE LAST STRING
        for(int j=0 ; j<occ ; j++){
            int min = Integer.MAX_VALUE;
            char c = '\0';
            for(int i=0 ; i<26 ; i++){
                if(freq[i] > -1 && freq[i] < min){
                    min = freq[i];
                    c = (char)(i + 'a');
                }
            }
            freq[c - 'a'] = -1;
            last += c;
        }
        
        return last;
    }
}