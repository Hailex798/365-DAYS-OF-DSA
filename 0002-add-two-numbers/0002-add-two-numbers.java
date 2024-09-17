//OPTIMISED - 2(CARRY:OVER)

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int prev = 0;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1 != null || l2 != null || prev > 0){
            int sum = prev;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            int curr = sum % 10;
            ListNode node = new ListNode(curr);
            temp.next = node;
            temp = node;
            prev = sum / 10;
        }

        return dummy.next;
    }
}