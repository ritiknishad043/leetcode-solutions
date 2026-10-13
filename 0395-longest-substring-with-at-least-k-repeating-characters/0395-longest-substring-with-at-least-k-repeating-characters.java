class Solution {
    public int longestSubstring(String s, int k) {
        return ans(s,0,s.length(),k);
    }
    int ans(String s,int start,int end,int k){
        if(end-start<k){
            return 0;
        }
        int[] freq=new int[26];
        for(int i=start;i<end;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=start;i<end;i++){
            if(freq[s.charAt(i)-'a']<k){
                int j=i+1;
                while(j<end && freq[s.charAt(j)-'a']<k){
                    j++;
                }
                return Math.max(ans(s,start,i,k),ans(s,j,end,k));
            }

        }
        return end-start;
    }
}