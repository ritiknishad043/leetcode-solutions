class Solution {
    public int maxProduct(int n) {
        int count=0;
        int temp=n;
        while(temp>0){
            count++;
            temp/=10;
        }
        int[] arr=new int[count];
        temp=n;
        int i=0;
        while(temp>0){
            arr[i++]=temp%10;
            temp/=10;
        }
        Arrays.sort(arr);
        return arr[count-1]*arr[count-2];
    }
}