class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            int start=0;
            int end=n-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(grid[i][mid]>=0){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            count+=grid[i].length-start;
        }
        return count;
    }
}