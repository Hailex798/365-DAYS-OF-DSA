//BF - 1(LL -> NO.)

class Solution {
    public boolean isPalindrome(ListNode head) {
        String dig = "";
        
        while(head != null){
            dig += head.val;
            head = head.next;
        }
        
        int i=0;
        int j=dig.length()-1;
        
        while(i<j){
            if(dig.charAt(i++) != dig.charAt(j--)) return false;
        }
        
        return true;
    }
}