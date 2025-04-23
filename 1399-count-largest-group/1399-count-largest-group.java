import java.util.*;

class Solution {
    public int countLargestGroup(int n) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for(int i=1 ; i<=n ; i++){
            int sum = 0;
            int number = i;
            while(number > 0){
                sum += number%10;
                number /= 10;
            }
            table.put(sum, table.getOrDefault(sum, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(int i: table.keySet()){
            max = Math.max(max, table.get(i));
        }

        int count = 0;
        for(int i: table.keySet()){
            if(table.get(i) == max) count++;
        }

        return count;
    }
}