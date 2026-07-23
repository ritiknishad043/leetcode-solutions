class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int val:nums1){
            map.add(val);
        }
        for(int val:nums2){
            if(map.contains(val)){
                result.add(val);
            }
        }
        int i=0;
        int[] arr=new int[result.size()];
        for(int val:result){
            arr[i++]=val;
        }
        return arr;
        
    }
}