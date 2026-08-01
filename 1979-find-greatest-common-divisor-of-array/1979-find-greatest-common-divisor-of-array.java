class Solution {
    int gcd(int i,int j){
        while(j!=0){
            int temp=j;
            j=i%j;
            i=temp;
        }
        return i;
    }
    public int findGCD(int[] nums) {
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        if(nums[i]<min){
            min=nums[i];
        }
       } 
       return gcd(min,max);
    }
}