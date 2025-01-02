//BF - 1(BASIC ITERATION)

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len = queries.length;
        int wLen = words.length;
        int[] ans = new int[wLen];
        String vowels = "aeiou";

        // PREFIX SUM
        if (vowels.indexOf(words[0].charAt(0)) != -1 && vowels.indexOf(words[0].charAt(words[0].length() - 1)) != -1) {
            ans[0] = 1;
        }
        for (int j = 1; j < wLen ; j++) {
            int sLen = words[j].length();

            if (vowels.indexOf(words[j].charAt(0)) != -1 && vowels.indexOf(words[j].charAt(sLen - 1)) != -1) {
                ans[j] = ans[j - 1] + 1;
            }else{
                ans[j] = ans[j-1];
            }
        }

        for(int i: ans) System.out.println(i);

        int[] result = new int[len];
        //CHECKING FOR ANSWERS VIA PREFIX-SUM
        for (int i = 0; i < len; i++) {
            int m = queries[i][0];
            int n = queries[i][1];
            int query = 0;

            if(m-1 >= 0){
                query = ans[n] - ans[m-1];
            }else{
                query = ans[n];
            }

            result[i] = query;
        }

        return result;
    }
}