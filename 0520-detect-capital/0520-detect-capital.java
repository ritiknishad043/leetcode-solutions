class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(ch<97){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else if(count==1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            return true;
        }
        else if(count==n){
            return true;
        }
        return false;

    }
}