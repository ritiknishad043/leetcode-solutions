class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(isEven(digits(nums[i]))){
                count++;
            }
        }
        return count;
    }
    int digits(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    boolean isEven(int n){
        return n%2==0;
    }
}