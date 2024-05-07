//OPTIMISED - 1(ARRAYLIST)

class Solution {
    public ListNode doubleIt(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode ptr = head;
        
        //CONVERT LL -> AL
        while(ptr != null){
            list.add(ptr.val);
            ptr = ptr.next;
        }
        
        //DOUBLING THE VALUE VIA AL
        int r = list.size()-1;
        int carry = 0;
        while(r >= 0){
            int val = list.get(r) * 2;
            list.set(r, (val+carry) % 10);
            carry = (val+carry) / 10;
            if(r == 0 && carry > 0){
                list.add(r, carry);
            }
            r--;
        }
        
        //CONVERTING AL -> LL BACK
        ptr = head;
        for(int i=0 ; i<list.size() ; i++){
            if(ptr.next == null && i < list.size()-1){
                ListNode nxt = new ListNode();
                ptr.next = nxt;
            }
            ptr.val = list.get(i);
            ptr = ptr.next;
        }
        
        return head;
    }
}