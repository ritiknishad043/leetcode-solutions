class Solution {
    public String finalString(String s) {
        StringBuilder fault=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                fault.reverse();
            }
            else{
                fault.append(s.charAt(i));
            }

        }
        return fault.toString();
    }
}