class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>low){
                low=weights[i];
            }
            high+=weights[i];
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int requiredDay=1;
            int currentLoad=0;
            for(int i=0;i<weights.length;i++){
                if((currentLoad+weights[i])>mid){
                    requiredDay++;
                    currentLoad=0;
                }
                currentLoad+=weights[i];
            }
            if(requiredDay>days){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}