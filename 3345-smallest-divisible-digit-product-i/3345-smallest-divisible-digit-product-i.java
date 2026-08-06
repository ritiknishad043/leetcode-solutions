class Solution {
    int digitproduct(int n,int t){
        int product=1;
        while(n>0){
            product=(product*(n%10))%t;
            n/=10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n; ;i++){
            int product=digitproduct(i,t);
            if(product==0){
                return i;
            }
        }
    }
}