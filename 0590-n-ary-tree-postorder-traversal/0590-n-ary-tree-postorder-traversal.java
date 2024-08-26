//OPTIMISED - 1(RECURSION: POST-ORDER TRAVERSAL)

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        
        postNary(root, result);
        
        return result;
    }
    
    public void postNary(Node node, List<Integer> list){
        if(node == null) return ;
        
        for(Node n: node.children){
            postNary(n, list);
        }
        
        list.add(node.val);
    }
}