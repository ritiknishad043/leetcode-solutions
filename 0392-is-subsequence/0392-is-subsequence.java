class Solution {
    public boolean isSubsequence(String s, String t) {
        int start1=0;
        int start2=0;
        int lenS=s.length();
        int lent=t.length();
        char[] charS = s.toCharArray();
        char[] chart = t.toCharArray();
        while(start1<lenS && start2<lent){
            if(charS[start1]==chart[start2]){
                start1++;
                start2++;
            }
            else{
                start2++;
            }
        }
        return start1==lenS;
    }
}