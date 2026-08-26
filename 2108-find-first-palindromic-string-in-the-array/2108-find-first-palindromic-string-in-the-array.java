class Solution {
    String reverseword(String x){
        StringBuilder word=new StringBuilder(x);
        word.reverse();
        return word.toString();
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String rev=reverseword(words[i]);
            if(words[i].equals(rev)){
                return words[i];
            }
        }
        return "";
    }
}