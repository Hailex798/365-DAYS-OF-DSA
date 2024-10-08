//OPTIMISED - 1(HARE & TORTOISE)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    
        while(fast != null && fast.next != null){            
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}