//BF - 1(FCFS SCHEDULING)

class Solution {
    public double averageWaitingTime(int[][] customers) {
        int len = customers.length;
        //THE 1ST CUSTOMER WAITING TIME IS ALWAYS GONNA BE THE EXECUTION TIME
        double avg = customers[0][1];
        int tot = customers[0][0] + customers[0][1];
        
        for(int i=1 ; i<len ; i++){
            //IF ARRIVING IS TIME IS LATER THAN TOT SCHEDULED TIME
            if(tot < customers[i][0]) tot = customers[i][0] + customers[i][1];
            else tot = tot + customers[i][1];

            avg += (tot - customers[i][0]);
        }
        
        return avg/len;
    }
}