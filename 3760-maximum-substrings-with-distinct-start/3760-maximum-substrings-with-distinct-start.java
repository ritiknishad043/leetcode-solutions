class Solution {
    public int maxDistinct(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        int unique=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                unique++;
            }
        }
        return unique;
    }
}