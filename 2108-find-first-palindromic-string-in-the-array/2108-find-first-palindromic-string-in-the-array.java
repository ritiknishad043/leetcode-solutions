// class Solution {
//     String reverseword(String x){
//         StringBuilder word=new StringBuilder(x);
//         word.reverse();
//         return word.toString();
//     }
//     public String firstPalindrome(String[] words) {
//         for(int i=0;i<words.length;i++){
//             String rev=reverseword(words[i]);
//             if(words[i].equals(rev)){
//                 return words[i];
//             }
//         }
//         return "";
//     }
// }


class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            int left=0;
            int right=word.length()-1;
            boolean ispalindrom=true;
            while(left<right){
                if(word.charAt(left)!=word.charAt(right)){
                    ispalindrom=false;
                    break;
                }
                left++;
                right--;
            }
            if(ispalindrom){
                return word;
            }
        }
        return "";
    }
}