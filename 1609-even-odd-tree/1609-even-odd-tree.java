//OPTIMISED - 1(BFS: QUEUE<LINKEDLIST>)

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        int x=0;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            
            for(int i=0 ; i<n ; i++){
                if(q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek().right != null){
                    q.add(q.peek().right);
                }
                list.add(q.remove().val);
            }
            if(!checkEvenOdd(list, x++)) return false;
        }
        
        return true;
    }
    //CHECK EVEN-ODD
    public boolean checkEvenOdd(List<Integer> list, int x){
        int len = list.size();
        if(len == 0) return true;
        int prev = list.get(0);
        //EVEN INDEX HEIGHT
        if((x&1) == 0){
            if((prev&1) == 0) return false;
            for(int i=1 ; i<len ; i++){
                int e = list.get(i);
                if(list.get(i) <= prev || (e&1) == 0){
                    return false;
                }else{
                    prev = list.get(i);
                }
            }
        }
        //ODD INDEX HEIGHT
        else{
            if((prev&1) == 1) return false;
            for(int i=1 ; i<len ; i++){
                int e = list.get(i);
                if(e >= prev || (e&1) == 1){
                    return false;
                }else{
                    prev = list.get(i);
                }
            }
        }
        return true;
    }
}