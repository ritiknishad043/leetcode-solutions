class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int boundary=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            boundary+=nums[i];
            if(boundary==0){
                count++;
            }
        }
        return count;
    }
}