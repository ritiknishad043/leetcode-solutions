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
        for(int i=0;i<details.length;i++){
            int age=(details[i].charAt(11)-'0')*10+(details[i].charAt(12)-'0');
            if(age>60){
                count++;
            }
        }
        return count;
    }
}