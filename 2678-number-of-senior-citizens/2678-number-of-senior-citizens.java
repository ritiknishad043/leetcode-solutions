// class Solution {
//     public int countSeniors(String[] details) {
//         int count=0;
//         for(String str:details){
//             if(Integer.valueOf(str.substring(11,13))>60){
//                 count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String str:details){
            int age=Integer.valueOf((str.charAt(11)-'0')*10+(str.charAt(12)-'0'));
            if(age>60){
                count++;
            }
        }
        return count;
    }
}