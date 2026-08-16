class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int first=-1;
        List<Integer> ans=new ArrayList<>();
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(first!=-1){
            while(first<nums.length && nums[first]==target){
                ans.add(first);
                first++;
            }
        }
        return ans;
    }
}