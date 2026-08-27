// class Solution {
//     public int longestPalindrome(String s) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         int length=0;
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//             if(map.get(ch)%2==0){
//                 length+=2;
//             }
//         }
//         for (char ch : map.keySet()) {
//             if (map.get(ch) % 2 == 1) {
//                 length++;
//                 break;
//             }
//         }
//         return length;
//     }
// }
class Solution {
    public int longestPalindrome(String s) {
        int[] freq=new int[128];
        int length=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]++;
        }
        boolean odd=false;
        for(int x:freq){
            if(x%2==0){
                length+=x;
            }
            else{
                odd=true;
                length+=x-1;
            }
        }
        if(odd){
            length++;
        }
        return length;
    }
}