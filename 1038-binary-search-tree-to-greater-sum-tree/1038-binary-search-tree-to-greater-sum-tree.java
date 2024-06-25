//BF - 1(IN-ORDER TRAVERSAL)

class Solution {
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> ioList = new ArrayList<>();
        inOrder(root, ioList);
        
        //SORT IN DESCENDING ORDER
        Collections.reverse(ioList);
        
        replaceVal(root, ioList);
        return root;
    }
    
    //USED TO STORE VALUES IN IN-ORDER MANNER IN LIST
    public void inOrder(TreeNode node, List<Integer> ioList){
        if(node == null){
            return ;
        }
        //LEFT
        inOrder(node.left, ioList);
        //ROOT
        ioList.add(node.val);
        //RIGHT
        inOrder(node.right, ioList);
    }
    
    //USED TO REPLACE THE NEW VALUES --> POST-ORDER TRAVERSAL
    public void replaceVal(TreeNode root, List<Integer> ioList){
        if(root == null){
            return ;
        }
        
        replaceVal(root.left, ioList);
        
        int nodeSum = 0;
        for(int i: ioList){
            if(i > root.val){
                nodeSum += i;
            }else{
                break;
            }
        }
        root.val += nodeSum;
        
        replaceVal(root.right, ioList);
    }
}