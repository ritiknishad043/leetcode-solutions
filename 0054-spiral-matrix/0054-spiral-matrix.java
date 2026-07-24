class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        List<Integer> spiral=new ArrayList<>();
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=col-1;
        while(top<=bottom && left<=right){
            // Top row
            for(int i=left;i<=right;i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            //Right col
            for(int i=top;i<=bottom;i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            //Bottom row
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // Left column
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiral;
    }
}