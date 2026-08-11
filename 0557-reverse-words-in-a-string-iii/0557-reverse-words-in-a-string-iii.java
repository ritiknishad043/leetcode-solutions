class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        for(int i=0;i<=arr.length;i++){
            if(i==arr.length||arr[i]==' '){
                int end=i-1;
                while(start<end){
                    char temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
                start=i+1;
            }
        }
        return new String(arr);
    }
}