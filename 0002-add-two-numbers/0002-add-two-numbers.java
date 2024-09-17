//OPTIMISED - 1(CARRY:OVER)

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int prev = 0;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + prev;
            int curr = sum % 10;
            ListNode node = new ListNode(curr);
            temp.next = node;
            temp = node;
            prev = sum / 10;
            l1 = l1.next; l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + prev;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = node;
            prev = sum / 10;
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + prev;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = node;
            prev = sum / 10;
            l2 = l2.next;
        }
        if(prev != 0){
            ListNode last = new ListNode(prev);
            temp.next = last;
        }

        return dummy.next;
    }
}