class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sub=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<sub.length() && j<strs[i].length() && sub.charAt(j)==strs[i].charAt(j)){
                // if(sub.charAt(j)==strs[i].charAt(j)){
                //     j++;
                // }
                j++;
            }
            sub=sub.substring(0,j);
            if(sub.length()==0){
                return "";
            }
        }
        return sub;
    }
}