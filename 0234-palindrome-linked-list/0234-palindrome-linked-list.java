/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        String s = "";
        
        while(head != null){
            s += Integer.toString(head.val);
            head = head.next;
        }
        
        return pal(s);
    }
    
    public boolean pal(String s){
        int low = 0;
        int high = s.length() - 1;
        
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)) return false;
        }
        
        return true;
    }
}