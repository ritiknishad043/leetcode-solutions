// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int subarrays=0;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum==k){
//                     subarrays++;
//                 }
//             }
//         }
//         return subarrays;
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int subarrays=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (map.containsKey(sum-k)) {
                subarrays+=map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return subarrays;
    }
}