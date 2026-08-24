class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int k=0;
        while(k<=end){
            if(nums[k]==0){
                int temp=nums[start];
                nums[start]=nums[k];
                nums[k]=temp;
                start++;
                k++;
            }
            else if(nums[k]==1){
                k++;
            }
            else{
                int temp=nums[end];
                nums[end]=nums[k];
                nums[k]=temp;
                end--;
            }
            
        }
    }
}