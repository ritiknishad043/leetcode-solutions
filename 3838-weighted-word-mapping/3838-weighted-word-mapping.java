class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int k=0;
        StringBuilder newstr=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            newstr.append((char)('z'-sum%26));
        }
        return newstr.toString();
    }
}