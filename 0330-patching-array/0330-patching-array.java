//OPTIMISED - 1(GREEDY APPROACH)

class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1; // The smallest number that we cannot form
        int patches = 0; // Number of patches added
        int i = 0; // Index to iterate through the nums array

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                // If the current number in the array is less than or equal to miss,
                // it can help form new numbers up to miss + nums[i]
                miss += nums[i];
                i++;
            } else {
                // Otherwise, we need to patch the array with miss itself
                miss += miss;
                patches++;
            }
        }

        return patches;
    }
}