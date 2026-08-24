class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digitsum=0;
        int temp=x;
        while(temp>0){
            digitsum+=temp%10;
            temp/=10;
        }
        return (x%digitsum==0)?digitsum:-1;
    }
}