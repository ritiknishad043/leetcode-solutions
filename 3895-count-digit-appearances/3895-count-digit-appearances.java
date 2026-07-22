class Solution {
    int digitcount(int num,int digit){
        int count=0;
        while(num>0){
            if(num%10==digit){
                count++;
            }
            num/=10;
        }
        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=digitcount(nums[i],digit);
        }
        return count;
    }
}