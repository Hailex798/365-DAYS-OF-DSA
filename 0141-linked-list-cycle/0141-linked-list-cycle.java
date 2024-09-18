//OPTIMISED - 1(CHANGING VALUES)

public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head != null){
            if(head.val == Integer.MIN_VALUE) return true;
            head.val = Integer.MIN_VALUE;
            head = head.next;
        }
        
        return false;
    }
}