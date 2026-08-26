class Solution {
    boolean isGood(int n){
        int digitSum=0;
        int squareSum=0;
        while(n>0){
            int last=n%10;
            digitSum+=last;
            squareSum+=last*last;
            n/=10;
        }
        return (squareSum-digitSum)>=50;
    }
    public boolean checkGoodInteger(int n) {
        return isGood(n);
    }
}