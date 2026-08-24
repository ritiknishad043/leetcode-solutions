class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean v=false;
        boolean c=false;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v=true;
                }
                else{
                    c=true;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return v&&c;
    }
}