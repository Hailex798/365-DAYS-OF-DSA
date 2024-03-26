//OPTIMISED - 1(MID + REVERSE + MERGE)

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode middle = findMid(head);
        middle = reverse(middle);
        ListNode ptr = head;
        
        while(ptr != null || middle != null){
            if(ptr.next == null){
                ptr.next = middle;
                break;
            }
            ListNode nxt = ptr.next;
            ListNode nxt2 = middle.next;
            ptr.next = middle;
            middle.next = nxt;
            ptr = nxt;
            middle = nxt2;
        }
    }
    
    //FINDING THE MIDDLE OF THE LINKED LIST
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    
    //REVERSING THE LINKED LIST
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        return prev;
    }
}