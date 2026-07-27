class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i=k-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}