class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        int n=nums.length;
        if(n<=1){
            return true;
        }
        int i=0;
        while(i<n-1&& nums[i]<=nums[i+1]){
            i++;
        }
        if(i!=n-1){
            increasing = false;
        }
        i=0;

        while(i<n-1&& nums[i]>=nums[i+1]){
            i++;
        }
        if(i!=n-1){
            decreasing = false;
        }
        return increasing || decreasing;
    }
}