class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1=num;
        if(num==0){
            return true;
        }
        int reverse1=0;
        while(temp1>0){
            reverse1=(reverse1*10)+temp1%10;
            temp1/=10;
        }
        int temp2=reverse1;
        int reverse2=0;
        while(temp2>0){
            reverse2=(reverse2*10)+temp2%10;
            temp2/=10;
        }
        return num==reverse2;
    }
}