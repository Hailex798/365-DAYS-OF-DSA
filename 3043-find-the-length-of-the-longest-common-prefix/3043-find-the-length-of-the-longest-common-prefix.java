class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int num : arr1) {
            list1.add(Integer.toString(num));
        }
        for (int num : arr2) {
            list2.add(Integer.toString(num));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        int maxLength = 0;
        for (String str1 : list1) {
            int index = Collections.binarySearch(list2, str1);
            if (index < 0) {
                index = -index - 1;
            }
            if (index < list2.size()) {
                maxLength = Math.max(maxLength, commonPrefixLength(str1, list2.get(index)));
            }
            if (index > 0) {
                maxLength = Math.max(maxLength, commonPrefixLength(str1, list2.get(index - 1)));
            }
        }
        return maxLength;
    }

    private static int commonPrefixLength(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }
}
