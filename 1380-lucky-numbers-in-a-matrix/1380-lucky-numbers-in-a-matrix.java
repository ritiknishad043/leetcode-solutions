class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean max=true;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][col]>min){
                    max=false;
                    break;
                }
            }
            if(max){
                list.add(min);
            }
        }
        return list;
    }
}