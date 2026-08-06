class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer>  hash =new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hash.put(ch,hash.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            if(hash.get(ch1)==1){
                return i;
            }
        }
        return -1;
    }
}