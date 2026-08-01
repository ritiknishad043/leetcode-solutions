class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftsum=new int[n];
        int[] rightsum=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int lsum=0;
            for(int j=0;j<i;j++){
                lsum+=nums[j];
            }
            leftsum[i]=lsum;
            int rsum=0;
            for(int j=i+1;j<n;j++){
                rsum+=nums[j];
            }
            rightsum[i]=rsum;
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}