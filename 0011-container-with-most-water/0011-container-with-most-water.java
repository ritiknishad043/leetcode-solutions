class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=Integer.MIN_VALUE;
        while(j!=0){
            int val=Math.min(height[i],height[j])*(j-i);
            if(val>max){
                max=val;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
            
        }
        return max;
    }
}