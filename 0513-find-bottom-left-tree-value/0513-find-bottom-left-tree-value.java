//OPTIMISED - 1(BFS TRAVERSAL: ITERATIVE)

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int h = height(root);
        
        List<Integer> list = new ArrayList<>();
        bfs(root, h, list);
        
        return list.get(0);
    }
    
    //BFS TRAVERSAL
    public void bfs(TreeNode root, int level, List<Integer> list){
        if(root == null){
            return ;
        }else if(level == 1){
            list.add(root.val);
        }else if(level > 1){
            bfs(root.left, level-1, list);
            bfs(root.right, level-1, list);
        }
    }
    
    //HEIGHT OF THE TREE
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int lheight = height(root.left);
            int rheight = height(root.right);
            
            if(lheight > rheight){
                return lheight + 1;
            }else{
                return rheight + 1;
            }
        }
    }
}