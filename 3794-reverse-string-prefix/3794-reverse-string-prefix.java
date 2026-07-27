class Solution {
    public String reversePrefix(String s, int k) {
        String result="";
        for(int i=k-1;i>=0;i--){
            result+=s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            result+=s.charAt(i);
        }
        return result;
    }
}