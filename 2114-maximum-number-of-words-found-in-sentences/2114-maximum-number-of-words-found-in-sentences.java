class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            int count=1;
            for(char ch : sentences[i].toCharArray()){
                if(ch==' '){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}