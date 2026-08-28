// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         int n1=nums1.length;
//         int n2=nums2.length;
//         HashMap<Integer,Integer> freq=new HashMap<>();
//         for(int i=0;i<n1;i++){
//             freq.put(nums1[i],freq.getOrDefault(nums1[i],0)+1);
//         }
//         ArrayList<Integer> arr=new ArrayList<>();
//         for(int i=0;i<n2;i++){
//             if(freq.containsKey(nums2[i])){
//                 if(freq.get(nums2[i])>0){
//                     arr.add(nums2[i]);
//                     freq.put(nums2[i],freq.getOrDefault(nums2[i],0)-1);
//                 }
//             }
//         }
//         int[] ans = new int[arr.size()];
//         int i = 0;
//         for(int x : arr){
//             ans[i] = x;
//             i++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq=new int[1001];
        for(int i=0;i<nums1.length;i++){
            freq[nums1[i]]++;
        }
        int[] ans=new int[Math.min(nums1.length,nums2.length)];
        int j=0;;
        for(int i=0;i<nums2.length;i++){
            if(freq[nums2[i]]>0){
                ans[j++]=nums2[i];
                freq[nums2[i]]--;
            }
        }
        return Arrays.copyOf(ans,j);
    }
}