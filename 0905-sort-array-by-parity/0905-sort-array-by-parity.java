class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums;
        }
        int start=0;
        int end=n-1;
        while(start<end){
            if(nums[start]%2!=0 && nums[end]%2==0){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            if(nums[start]%2==0){
                start++;
            }
            if(nums[end]%2!=0){
                end--;
            }
        }
        return nums;
    }
}