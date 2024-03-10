//OPTIMISED - 1(FREQUENCY)
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        List<Integer> list = new ArrayList<>();
        
        //MAPPING FREQUENCIES
        for(int i: nums1){
            freq[i] = 1;
        }
        
        //CHECKING IF IT EXIST IN 2ND ARRAY
        for(int i: nums2){
            if(freq[i] == 1){
                list.add(i);
                freq[i] = 0;
            }
        }
        
        int[] ans = new int[list.size()];
        int x = 0;
        for(int i: list){
            ans[x++] = i;
        }
        
        return ans;
    }
}