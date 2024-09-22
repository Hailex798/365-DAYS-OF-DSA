//OPTIMISED - 1(TWO-POINTERS)

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while(ptrA != ptrB){
            if(ptrA == null) ptrA = headB;
            else ptrA = ptrA.next;
            
            if(ptrB == null) ptrB = headA;
            else ptrB = ptrB.next;
        }
        
        return ptrA;
    }
}