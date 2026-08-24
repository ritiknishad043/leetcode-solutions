class Solution {
    public int maxDifference(String s) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]%2==0 && arr[i]!=0){
                min = Math.min(min, arr[i]);
            }
            if(arr[i]%2!=0){
                max = Math.max(max, arr[i]);
            }
        }
        return max-min;
    }
}