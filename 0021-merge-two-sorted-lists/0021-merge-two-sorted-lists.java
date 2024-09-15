//BF - 1(3-POINTERS)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode ptr = dummyHead;

        //TWO-POINTER JUGGLING OF NODES
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ptr.next = list1;
                list1 = list1.next;
            }else{
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }

        //FOR REMAINING LIST
        if(list1 != null) ptr.next = list1;
        else ptr.next = list2;

        return dummyHead.next;
    }
}