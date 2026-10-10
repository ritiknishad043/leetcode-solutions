class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high){
                high=piles[i];
            }
        }        
        while(low<high){
            int mid=low+(high-low)/2;
            long hour=0;
            for(int i=0;i<piles.length;i++){
                hour+=(piles[i]+(long)mid-1)/mid;
            }
            if(hour>h){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}