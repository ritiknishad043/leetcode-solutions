// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j] && j-i<=k){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
            if(i>=k){
                hash.remove(nums[i-k]);
            }
        }
        return false;
    }
}