class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int length=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==0){
                length+=2;
            }
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) % 2 == 1) {
                length++;
                break;
            }
        }
        return length;
    }
}