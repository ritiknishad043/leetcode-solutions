class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> unique=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            unique.add(ch);
        }
        return unique.size();
    }
}