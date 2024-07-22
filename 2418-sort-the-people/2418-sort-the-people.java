class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        
        //MAPPING HEIGHT -> 
        for(int i=0 ; i<heights.length ; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        
        int i = 0; int j = heights.length-1;
        while(i<j){
            int temp = heights[i];
            heights[i++] = heights[j];
            heights[j--] = temp;
        }
        
        for(i=0 ; i<names.length ; i++){
            names[i] = map.get(heights[i]);
        }
        
        return names;
    }
}