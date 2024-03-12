//OPTIMISED - 1(HASHMAP + FREQ ARRAY + STRINGBUILDER)

class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder("");
        int[] freq = new int[26];
        
        //MAPPING FREQ FOR STRING --> S
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        //ALL UNIQUE COMMON OCCURENCES OF ORDER & S ARE STORED IN ORDER IN ANS
        for(char c: order.toCharArray()){
            if(map.containsKey(c)){
                int x = map.get(c);
                while(x > 0){
                    ans.append(c);
                    x--;
                }
                map.remove(c);
            }
        }
        
        if(!map.isEmpty()){
            //MAPPING LEFTOVER FREQUENCY
            for(char c: map.keySet()){
                freq[c - 'a'] = map.get(c);
            }
        }else{
            return ans.toString();
        }
        System.out.println(ans);
        for(int i=0 ; i<26 ; i++){
            while(freq[i] > 0){
                ans.append((char)(i + 'a'));
                freq[i]--;
            }
        }
        
        return ans.toString();
    }
}