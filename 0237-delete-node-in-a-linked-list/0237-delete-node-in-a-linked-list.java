//OPTIMISED - 1(TWO-POINTERS)

class Solution {
    public void deleteNode(ListNode node) {
        ListNode left = node;
        ListNode right = node.next;
        left.val = right.val;
        
        while(right.next != null){
            left = left.next;
            right = right.next;
            left.val = right.val;
        }
        left.next = null;
    }
}