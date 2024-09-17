class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ", -1);
        String[] words2 = s2.split(" ", -1);
        Map<String, Integer> map = new HashMap<>();
        
        for(String i: words1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(String i: words2){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<String> list = new ArrayList<>();
        
        for(String i: map.keySet()){
            if(map.get(i) == 1){
                list.add(i);
            }
        }
        
        return list.toArray(new String[0]);
    }
}