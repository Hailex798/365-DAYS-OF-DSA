//BRUTE FORCE - 1(DOUBLE ITERATION)

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0 ; i<nums1.length ; i++){
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        
        return arr;
    }
}