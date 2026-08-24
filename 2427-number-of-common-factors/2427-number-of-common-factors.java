// class Solution {
//     public int commonFactors(int a, int b) {
//         int count=0;
//         int min=Math.min(a,b);
//         for(int i=1;i<=min;i++){
//             if(a%i==0 && b%i==0){
//                 count++;
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int commonFactors(int a, int b) {
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int count=0;
        for(int i=1;i*i<=gcd;i++){
            if(gcd%i==0){
                count++;
                if(i!=gcd/i){
                    count++;
                }
            }
        }
        return count;
    }
}