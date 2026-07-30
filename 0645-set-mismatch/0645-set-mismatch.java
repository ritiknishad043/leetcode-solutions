class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] map=new int[nums.length+1];
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }
        for(int i=0;i<=nums.length;i++){
            if(map[i]>1){
                ans[0]=i;
            }
            if(map[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}