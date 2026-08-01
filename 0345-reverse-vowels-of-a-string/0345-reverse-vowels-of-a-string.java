class Solution {
    boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public String reverseVowels(String s) {
        char[] charS=s.toCharArray();
        int start=0;
        int end=charS.length-1;
        while(start<end){
            char ch1=charS[start];
            char ch2=charS[end];
            if(!isVowel(ch1)){
                start++;
            }
            else if(!isVowel(ch2)){
                end--;
            }
            else{
                char temp=charS[start];
                charS[start]=charS[end];
                charS[end]=temp;
                start++;
                end--;
            }

        }
        return new String(charS);
    }
}