//BRUTE FORCE - 1(MODIFYING NODE VALUES)


class Solution {
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode ptr = head;
        
        while(ptr != null){
            list.add(ptr.val);
            ptr = ptr.next;
        }
        
        int j = list.size() - 1;
        int insert = 1;
        int len = (int)(list.size()/2);
        
        while(len-- > 0){
            int ele = list.remove(j);
            list.add(insert, ele);
            insert += 2;
        }
        
        ptr = head;
        int i = 0;
        while(ptr != null){
            ptr.val = list.get(i++);
            ptr = ptr.next;
        }
    }
}