class Solution {
    public boolean isSubsequence(String s, String t) {
        int start1=0;
        int start2=0;
        char[] charS = s.toCharArray();
        char[] chart = t.toCharArray();
        while(start1<s.length() && start2<t.length()){
            if(charS[start1]==chart[start2]){
                start1++;
                start2++;
            }
            else{
                start2++;
            }
        }
        return start1==s.length();
    }
}