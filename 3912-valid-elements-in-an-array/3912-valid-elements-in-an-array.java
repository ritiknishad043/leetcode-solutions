class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            boolean left=true;
            boolean right=true;
            for(int j=0;j<i;j++){
                if(nums[i]<=nums[j]){
                    left=false;
                    break;
                }
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<=nums[j]){
                    right=false;
                    break;
                }
            }
            if(left||right){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}