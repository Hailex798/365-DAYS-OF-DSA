class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int longest = 1;
        int prev = groups[0];
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for(int i=1 ; i<words.length ; i++){
            if(prev == 0 && groups[i] == 1){
                prev = 1;
                longest++;
                list.add(words[i]);
            }else if(prev == 1 && groups[i] == 0){
                prev = 0;
                longest++;
                list.add(words[i]);
            }
        }

        return list;
    }
}