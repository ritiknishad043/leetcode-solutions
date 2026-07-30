class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        int place=1;
        int sum=0;
        while(n>0){
            if(n%10!=0){
                sum+=n%10;
                num+=(n%10)*place;
                place*=10;
            }
            
            n/=10;
        }
        return num*sum;
    }
}