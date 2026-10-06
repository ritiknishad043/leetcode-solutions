class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] zrow=new int[row];
        int[] zcol=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    zrow[i]=1;
                    zcol[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(zrow[i]==1||zcol[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}