class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    map.add(nums2[j]);
                }
            } 
        }
        int i=0;
        int[] arr=new int[map.size()];
        for(int num:map){
            arr[i]=num;
            i++;
        }
        return arr;
    }
}