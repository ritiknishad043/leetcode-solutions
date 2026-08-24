// class Solution {
//     public int maximum69Number (int num) {
//         String number = String.valueOf(num);
//         int max=num;
//         for(int i=0;i<number.length();i++){
//             StringBuilder sb=new StringBuilder(number);
//             if(number.charAt(i)-'0'==6){
//                 sb.replace(i,i+1,"9");
//             }
//             int numNew = Integer.parseInt(sb.toString());
//             if(numNew>max){
//                 max=numNew;
//             }
//         }
//         return max;
//     }
// }


class Solution {
    public int maximum69Number (int num) {
        String number = String.valueOf(num);
        StringBuilder sb=new StringBuilder(number);
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)-'0'==6){
                sb.replace(i,i+1,"9");
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}