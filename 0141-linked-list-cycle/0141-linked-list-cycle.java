//OPTIMISED - 2(TWO-POINTERS)

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
             slow = slow.next;
            
            if(slow == fast) return true;
        }
        
        return false;
    }
}