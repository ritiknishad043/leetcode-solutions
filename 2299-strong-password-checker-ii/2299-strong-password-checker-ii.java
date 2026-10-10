class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int charcount=0;
        int upper=0;
        int lower=0;
        int digit=0;
        int special=0;
        Boolean noAdjacent=true;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            charcount++;
            if(Character.isUpperCase(ch)){
                upper++;
            }
            if(Character.isLowerCase(ch)){
                lower++;
            }
            if(Character.isDigit(ch)){
                digit++;
            }
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                special++;
            }   
        }
        for(int i=0;i<password.length()-1;i++){
            char ch=password.charAt(i);
            char ch1=password.charAt(i+1);
            if(ch==ch1){
                noAdjacent=false;
            }
        }
        if(charcount>=8 && upper>=1 && lower>=1 && digit>=1 && special>=1 && noAdjacent){
            return true;
        }
        return false;
    }
}