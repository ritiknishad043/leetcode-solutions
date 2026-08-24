class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int max=0;
        for(int i: bloomDay){
            if(i>max){
                max=i;
            }
        }
        int days=0;
        int start=1;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int flower=0;
            int bouquet=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    flower++;
                }
                else{
                    bouquet+=flower/k;
                    flower=0;
                }
            }
            bouquet+=flower/k;
            if(bouquet>=m){
                days=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return days;
    }
}