//OPTIMISED - 1(BRAIN-TEASER)

import java.util.Arrays; 

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        return Math.max(left.length > 0 ? Arrays.stream(left).max().getAsInt() : 0, right.length > 0 ? n - Arrays.stream(right).min().getAsInt() : 0);
    }
}