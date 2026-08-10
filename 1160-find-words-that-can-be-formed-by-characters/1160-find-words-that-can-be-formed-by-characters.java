class Solution {
    public int countCharacters(String[] words, String chars) {
        int count =0;
        int[] map=new int[26];
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            map[ch-'a']++;
        }
        for(int i=0;i<words.length;i++){
            int[] charmap=new int[26];
            boolean check=true;
            if(words[i].length()>chars.length()){
                continue;
            }
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                charmap[ch-'a']++;
            }
            for(int k=0;k<26;k++){
                if(charmap[k] > map[k]){
                    check=false;
                    break;
                }
            }
            if(check){
                count+=words[i].length();
            }
        }
        return count;
    }
}