//OPTIMISED - 1(BFS)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        int h = height(root);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=1 ; i<=h ; i++){
            List<Integer> list = new ArrayList<>();
            addCurrLvl(root, list, i);
            
            ans.add(list);
        }
        
        return ans;
    }
    public void addCurrLvl(TreeNode root, List<Integer> list, int lvl){
        if(root == null){
            return ;
        }else if(lvl == 1){
            list.add(root.val);
        }else{
            addCurrLvl(root.left, list, lvl-1);
            addCurrLvl(root.right, list, lvl-1);
        }
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        
        return lheight > rheight ? lheight + 1 : rheight + 1;
    }
}