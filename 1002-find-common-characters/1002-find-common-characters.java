class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq=new int[26];
        Arrays.fill(freq,Integer.MAX_VALUE);
        for(String word:words){
            int[] curr=new int[26];
            for(int i=0;i<word.length();i++){
                curr[word.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                freq[i]=Math.min(freq[i],curr[i]);
            }
        }
        List<String> str=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                str.add(String.valueOf((char)(i+'a')));
                freq[i]--;
            }
        }
        return str;
    }
}