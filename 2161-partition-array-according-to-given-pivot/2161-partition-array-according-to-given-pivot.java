class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int s=0,l=0;
        int j=nums.length-1;
        int sno=0;
        int lno=0;
        int equ=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                sno++;
            }
            if(nums[i]>pivot){
                lno++;
            }
            if(nums[i]==pivot){
                equ++;
            }
        }
        int[] small=new int[sno];
        int[] large=new int[lno];
        for(int k=0;k<nums.length;k++){
            if(nums[k]<pivot){
                small[s]=nums[k];
                s++;
            }
            if(nums[k]>pivot){

                large[l]=nums[k];
                l++;
            }
        }
        int index=0;
        for(int i=0;i<sno;i++){
            nums[index++]=small[i];
        }
        for(int i=0;i<equ;i++){
            nums[index++]=pivot;
        }
        for(int i=0;i<lno;i++){
            nums[index++]=large[i];
        }
        return nums;

    }
}