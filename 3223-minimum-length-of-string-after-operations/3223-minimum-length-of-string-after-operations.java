class Solution {
    public int minimumLength(String s) {
        if(s.length() < 3) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        int sum = 0;
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char c: map.keySet()){
            if((map.get(c)&1) == 1) sum += 1;
            else sum += 2;
        }
        
        return sum;
    }
}