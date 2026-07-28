class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxdiff=Integer.MIN_VALUE;
        if(nums.length<2){
            return 0;
        }
        else{
            int i=0;
            while(i+1<nums.length){
                if(nums[i+1]-nums[i]>maxdiff){
                    maxdiff=nums[i+1]-nums[i];
                }
                i++;
            }
        }
        return maxdiff;
    }
}