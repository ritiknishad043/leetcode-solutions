class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        char[] arr=word.toCharArray();
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ch){
                index=i+1;
                break;
            }
        }
        for(int i=0;i<index/2;i++){
            char temp=arr[i];
            arr[i]=arr[index-i-1];
            arr[index-i-1]=temp;
        }
        return new String(arr);

    }
}