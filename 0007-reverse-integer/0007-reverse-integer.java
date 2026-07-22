class Solution {
    public int reverse(int x) {
        long reverse=0;
        int negative=0;
        if(x<0){
            negative=1;
            x=x*-1;
        }
        while(x>0){
            int last=x%10;
            reverse=reverse*10+last;
            x/=10;
        }
        if(reverse>Integer.MAX_VALUE||reverse<Integer.MIN_VALUE){
            return 0;
        }
        if(negative==1) reverse=reverse*-1;
        return (int)reverse;
        
    }
}