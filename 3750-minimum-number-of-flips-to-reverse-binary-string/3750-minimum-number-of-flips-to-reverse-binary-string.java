// class Solution {
//     String toBinary(int n){
//         StringBuilder sb = new StringBuilder();
//         while(n != 0){
//             int rem = n % 2;
//             sb.append(rem);
//             n = n / 2;
//         }
//         sb = sb.reverse();
//         return sb.toString();
//     }
//     public int minimumFlips(int n) {
//         String binary=toBinary(n);
//         StringBuilder sb=new StringBuilder(binary);
//         String reverse=sb.reverse().toString();
//         int count=0;
//         for(int i=0;i<binary.length();i++){
//             char ch1=binary.charAt(i);
//             char ch2=reverse.charAt(i);
//             if(ch1!=ch2){
//                 count++;
//             }
//         }
//         return count;
//     }
// }


class Solution {
    String toBinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        sb = sb.reverse();
        return sb.toString();
    }
    public int minimumFlips(int n) {
        String binary = toBinary(n);
        int count = 0;
        int left = 0;
        int right = binary.length() - 1;
        while(left < right) {
            if(binary.charAt(left) != binary.charAt(right)) {
                count += 2;
            }
            left++;
            right--;
        }
        return count;
    }
}