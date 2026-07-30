class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int found=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==letter){
                found++;
            }
        }
        return (found*100)/n;
    }
}