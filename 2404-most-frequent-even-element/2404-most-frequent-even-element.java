class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int freq=-1;
        int ans=-1;
        for(int x:map.keySet()){
            if(map.get(x)>freq){
                freq=map.get(x);
                ans=x;
            }
            else if(freq==map.get(x)){
                ans=Math.min(ans,x);
            }
        }
        return ans;
    }
}