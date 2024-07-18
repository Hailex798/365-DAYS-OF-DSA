class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = Arrays.asList(1);
        res.add(temp);
        int p = 1;
        
        while(p < numRows){
            temp = new ArrayList<>(Arrays.asList(1,1));
            int i=1;
            while(i<p){
                temp.add(i, res.get(p-1).get(i) + res.get(p-1).get(i-1));
                i++;
            }
            res.add(temp);
            p++;
        }
        
        return res;
    }
}