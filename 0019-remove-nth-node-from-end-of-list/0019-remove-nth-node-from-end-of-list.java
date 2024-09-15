//BF - 1(FIND LEN > ITERATE)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        int len = 0;
        ListNode ptr = head;

        //FINDING LENGTH OF LL
        while(ptr != null){
            len++;
            ptr = ptr.next;
        }

        //IF N == LEN, DELETE HEAD
        if(len == n) return head.next;

        //FINDING TARGET INDEX TO DELETE - 1
        int target = len - n;
        ListNode slow = head;

        //SHIFTING POINTER TO TARGET-1 + DELETING TARGET
        for(int i=1 ; i<target ; i++){
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}