// class Solution {
//     public int maximumNumberOfStringPairs(String[] words) {
//         int count=0;
//         for(int i=0;i<words.length;i++){
//             for(int j=i+1;j<words.length;j++){
//                 StringBuilder sb=new StringBuilder(words[j]);
//                 sb.reverse();
//                 String rev=sb.toString();
//                 if(words[i].equals(rev)){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> map=new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String rev= new StringBuilder(words[i]).reverse().toString();
            if(map.contains(rev)){
                count++;
            }
            map.add(words[i]);
        }
        return count;
    }
}