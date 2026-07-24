class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rows=n;
        int col=n;
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=col-1;
        int num=1;
        while(top<=bottom && left<=right){
            // Top row
            for(int i=left;i<=right;i++){
                matrix[top][i]=num++;
            }
            top++;
            //Right col
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;
            //Bottom row
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=num++;
                }
                bottom--;
            }
            // Left column
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=num++;
                }
                left++;
            }
        }
        return matrix;
    }
}