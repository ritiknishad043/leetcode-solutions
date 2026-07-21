class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first=m-1;
        int sec=n-1;
        int merge=m+n-1;
        while(first>=0&&sec>=0){
            if(nums1[first]>nums2[sec]){
                nums1[merge]=nums1[first];
                first--; 
            }
            else{
                nums1[merge]=nums2[sec];
                sec--;
                
            }
            merge--;
        }
        while(sec>=0){
            nums1[merge]=nums2[sec];
            sec--;
            merge--;
        }
    }
}