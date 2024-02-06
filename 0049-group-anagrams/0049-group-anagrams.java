//OPTIMISED - 1(FREQUENY)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        List<List<String>> list = new ArrayList<>();
        
        for(int i=0 ; i<len ; i++){
            if(strs[i] != "kshitij"){
                List<String> rows = new ArrayList<>();
                rows.add(strs[i]);
                int[] freq = new int[26];
                //MAPPING FREQ FOR CURRENT STRING
                for(char x: strs[i].toCharArray()){
                    freq[x - 'a']++;
                }
                for(int j=i+1 ; j<len ; j++){
                    int[] tempFreq = new int[26];
                    //MAPPING TEMP FREQ
                    for(char x: strs[j].toCharArray()){
                        tempFreq[x - 'a']++;
                    }
                    if(Arrays.equals(freq, tempFreq)){
                        rows.add(strs[j]);
                        strs[j] = "kshitij";
                    }
                }
                list.add(rows);
            }
        }
        
        return list;
    }
}