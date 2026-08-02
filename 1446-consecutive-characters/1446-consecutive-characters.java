class Solution {
    public int maxPower(String s) {
        int count=1;
        int maxcount=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)==s.charAt(i)){
                count++;
            }
            else{
                count=1;
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        return maxcount;
    }
}