//OPTIMISED - 1(ITERATION -> LL)

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        if(head.next.next == null || head.next.next.next == null) return ans;
        
        List<Integer> critic = new ArrayList<>();
        
        int prev = head.val;
        ListNode ptr = head.next;
        int forw = ptr.next.val;
        
        if(ptr.val > prev && ptr.val > forw || ptr.val < prev && ptr.val < forw){
            critic.add(1);
        }
        
        int index = 1;
        
        //MADE A CRITIC LIST
        while(ptr.next != null){
            prev = ptr.val;
            ptr = ptr.next;
            index++;
            if(ptr.next == null) break;
            forw = ptr.next.val;
            if(ptr.val > prev && ptr.val > forw || ptr.val < prev && ptr.val < forw){
                critic.add(index);
            }
        }
        int len = critic.size();
        if(len < 2) return ans;
        
        ans[1] = critic.get(len-1) - critic.get(0);
        int min = Integer.MAX_VALUE;
        
        for(int i=1 ; i<len ; i++){
            min = Math.min(min, critic.get(i) - critic.get(i-1));
        }
        ans[0] = min;
        
        return ans;
    }
}