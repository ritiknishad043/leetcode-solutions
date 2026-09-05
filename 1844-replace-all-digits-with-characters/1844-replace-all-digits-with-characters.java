class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<sb.length();i+=2){
            char ch=(char)(sb.charAt(i-1)+(sb.charAt(i)-'0'));
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }
}