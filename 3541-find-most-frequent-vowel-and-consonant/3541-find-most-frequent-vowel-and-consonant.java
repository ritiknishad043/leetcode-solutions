class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        int vmax=0;
        int cmax=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vmax=Math.max(vmax,freq[i]);
            }
            else{
                cmax=Math.max(cmax,freq[i]);
            }
        }
        return vmax+cmax;
    }
}