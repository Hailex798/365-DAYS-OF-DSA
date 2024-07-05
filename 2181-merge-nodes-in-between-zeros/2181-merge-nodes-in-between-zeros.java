//OPTIMISED - 1(LL: TWO-POINTER)

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode zero = head.next;
        ListNode sum = head.next;
        int s = 0;
        
        while(zero != null){
            while(sum.val != 0){
                s += sum.val;
                sum = sum.next;
            }
            zero.val = s;
            sum = sum.next;
            zero.next = sum;
            zero = sum;
            s = 0;
        }
        
        return head.next;
    }
}