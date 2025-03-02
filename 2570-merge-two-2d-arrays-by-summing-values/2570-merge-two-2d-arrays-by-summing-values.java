import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0, j = 0;

        while (i < len1 || j < len2) {
            if (i < len1 && j < len2) {
                if (nums1[i][0] == nums2[j][0]) {
                    // Case 1: IDs match, sum the values
                    list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                    i++;
                    j++;
                } else if (nums1[i][0] < nums2[j][0]) {
                    // Case 2: nums1 has a smaller ID
                    list.add(new int[]{nums1[i][0], nums1[i][1]});
                    i++;
                } else {
                    // Case 3: nums2 has a smaller ID
                    list.add(new int[]{nums2[j][0], nums2[j][1]});
                    j++;
                }
            } else if (i < len1) {
                // Case 4: nums2 is exhausted, add remaining nums1 elements
                list.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                // Case 5: nums1 is exhausted, add remaining nums2 elements
                list.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }

        return list.toArray(new int[0][]);
    }
}