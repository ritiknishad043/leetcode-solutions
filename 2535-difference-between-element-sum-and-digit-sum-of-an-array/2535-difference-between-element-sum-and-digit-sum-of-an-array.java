class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digsum=0;
        for(int i=0;i<nums.length;i++){
            elesum+=nums[i];
            int temp = nums[i];
            while (temp > 0) {
                digsum += temp % 10;
                temp /= 10;
            }
        }
        return Math.abs(elesum-digsum);   
    }
}