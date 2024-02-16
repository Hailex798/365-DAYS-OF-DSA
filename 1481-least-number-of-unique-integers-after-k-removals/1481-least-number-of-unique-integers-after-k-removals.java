//BRUTE FORCE - 1(FREQ + SORTING<SORT COMPARATOR>)

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> sortedList = new ArrayList<>();
        
        //MAPPING ELEMENTS W THEIR FREQ ->
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
            sortedList.add(i);
        }
        
        //SORTED ARRAYLIST ACC. -> FREQ
        SortComparator comp = new SortComparator(map);
        Collections.sort(sortedList, comp);
        
        //STORING ONLY SINGLE OCCURENCE OF IT ACC. -> FREQ
        int prev = sortedList.get(0);
        for(int i=1 ; i<sortedList.size() ; i++){
            if(sortedList.get(i) == prev){
                sortedList.remove(i-1);
                i--;
            }
            prev = sortedList.get(i);
        }
        
        //REMOVING K ELEMENTS -> LEAST UNIQUE INTEGERS
        int ans = map.size();
        for(int i=0 ; i<sortedList.size() ; i++){
            int x = sortedList.get(i);
            if(map.get(x) <= k){
                k -= map.get(x);
                map.remove(x);
            }else if(map.get(x) > k){
                int freq = map.get(x);
                map.put(x, map.get(x) - k);
                k -= freq;
            }
            
            if(k <= 0){
                ans = map.size();
                return ans;
            }
        }
        
        return ans;
    }
}

// Implement Comparator Interface to sort the values
class SortComparator implements Comparator<Integer> {
    private final Map<Integer, Integer> freqMap;
 
    // Assign the specified map
    SortComparator(Map<Integer, Integer> tFreqMap)
    {
        this.freqMap = tFreqMap;
    }
 
    // Compare the values
    @Override
    public int compare(Integer k1, Integer k2)
    {
 
        // Compare value by frequency
        int freqCompare = freqMap.get(k1).compareTo(freqMap.get(k2));
 
        // Compare value if frequency is equal
        int valueCompare = k1.compareTo(k2);
 
        // If frequency is equal, then just compare by value, otherwise -
        // compare by the frequency.
        if (freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;
    }
}