//BF - 1(CHECK FOR ODD LENGTH ELEMENTS)

class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;

        int odd = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(char i: s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(char c: map.keySet()){
            if(map.get(c)%2 == 1) odd++;
        }

        if(odd > k) return false;

        return true;
    }
}