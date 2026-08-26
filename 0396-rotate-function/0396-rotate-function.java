// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         int n=nums.length;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for (int j = 0; j < n; j++) {
//                 sum += j * nums[j];
//             }
//             max=Math.max(max,sum);
//             int last = nums[n - 1];
//             for (int j = n - 1; j > 0; j--) {
//                 nums[j] = nums[j - 1];
//             }
//             nums[0]=last;
//         }
//         return max;
//     }
// }    //Time limit Exceeded

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        long sum=0;
        long current=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            current+=(long)i*nums[i];
        }
        long max=current;
        for (int i=n-1;i>0;i--){
            current = current + sum - (long) n * nums[i];
            max=Math.max(max,current);
        }
        return (int)max;
    }
}