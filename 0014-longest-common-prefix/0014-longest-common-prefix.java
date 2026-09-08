// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String sub=strs[0];
//         for(int i=1;i<strs.length;i++){
//             int j=0;
//             while(j<sub.length() && j<strs[i].length() && sub.charAt(j)==strs[i].charAt(j)){
//                 j++;
//             }
//             sub=sub.substring(0,j);
//             if(sub.length()==0){
//                 return "";
//             }
//         }
//         return sub;
//     }
// }


class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sub=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(sub)){
                sub=sub.substring(0,sub.length()-1);
            }
            if(sub.length()==0){
                return "";
            }
        }
        return sub;
    }
}