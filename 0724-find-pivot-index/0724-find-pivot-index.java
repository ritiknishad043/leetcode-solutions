// class Solution {
//     public int pivotIndex(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             int leftsum=0;
//             if(i>0){
//                 for(int j=i-1;j>=0;j--){
//                     leftsum+=nums[j];
//                 }
//             }
//             int rightsum=0;
//             for(int j=i+1;j<nums.length;j++){
//                 rightsum+=nums[j];
//             }
//             if(leftsum==rightsum){
//                 return i;
//             }
//         }
//         return -1;
        
//     }
// }

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}