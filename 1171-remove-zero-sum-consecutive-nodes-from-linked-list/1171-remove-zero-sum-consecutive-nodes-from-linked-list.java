//OPTIMISED - 2(TWO-POINTERS)

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        //LL --> AL
        ListNode ptr = head;
        while(ptr != null){
            list.add(ptr.val);
            ptr = ptr.next;
        }

        //DELETING 0 SUM SUB-ARRAY (SLIDING WINDOW)
        int idx = 0;
        
        while(idx < list.size()){
            int sum = 0;
            
            for(int i=idx ; i<list.size() ; i++){
                sum += list.get(i);
                
                while(sum == 0){
                    for(int j=idx ; j<=i ; j++){
                        list.remove(idx);
                    }
                    if(list.size() == 0) return null;
                    i = idx;
                    if(i < list.size()) sum = list.get(i);
                    else sum = list.get(i-1);
                }
                
            }
            
            idx++;
        }
        
        if(list.size() == 0) return null;
        
        //ASSIGNING AL --> LL
        ptr = head;
        ListNode slow = head;
        
        for(int i=0 ; i<list.size() ; i++){
            ptr.val = list.get(i);
            slow = ptr;
            ptr = ptr.next;
        }
        slow.next = null;

        return head;
    }
}