//BF - 1(HASHING)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        while(head != null){
            if(set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }
        
        return head;
    }
}