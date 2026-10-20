class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int current=0;
        int totaltime=0;
        for(int i=0;i<requests.length;i++){
            totaltime+=Math.abs(current-requests[i]);
            current=requests[i];
        }
        return totaltime;
    }
}