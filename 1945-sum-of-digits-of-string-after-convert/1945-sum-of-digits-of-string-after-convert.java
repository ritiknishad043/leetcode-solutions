class Solution {
    int digitsum(long num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int getLucky(String s, int k) {
        long num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int value=ch-'a'+1;
            num+=digitsum(value);

        }
        for(int i=1;i<k;i++){
            num=digitsum(num);
        }
        return (int)num;
    }
}