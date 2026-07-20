class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String snew=s+s;
        if(snew.contains(goal)){
            return true;
        }
        return false;
    }
}