class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean isprime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(i>=2 && isprime){
                list.add(i);
            }
        }
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE;
        int first=-1;
        int second=-2;
        for(int i=1;i<list.size();i++){
            int diff= list.get(i)-list.get(i-1);
            if(diff<min){
                min=diff;
                first=list.get(i-1);
                second=list.get(i);
            }
        }
        return new int[]{first,second};

    }
}