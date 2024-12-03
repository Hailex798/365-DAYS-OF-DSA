//OP - 1(ARRAYLIST: CHARACTER)

class Solution {
    public String addSpaces(String s, int[] spaces) {
        int stringIndex = 0;
        int spaceIndex = 0;
        
        ArrayList<Character> charList = new ArrayList<>();
        
        for(char c: s.toCharArray()){
            if(spaceIndex < spaces.length && spaces[spaceIndex] == stringIndex){
                spaceIndex++;
                charList.add(' ');
            }
            charList.add(c);
            stringIndex++;
        }
        
        String result = charList.stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining());
        
        return result;
    }
}