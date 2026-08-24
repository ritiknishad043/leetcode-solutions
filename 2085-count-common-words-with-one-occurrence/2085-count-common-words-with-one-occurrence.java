class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> first=new HashMap<>();
        HashMap<String,Integer> second=new HashMap<>();
        for(int i=0;i<words1.length;i++){
            first.put(words1[i],first.getOrDefault(words1[i],0) + 1);
        }
        for(int i =0;i<words2.length;i++){
            second.put(words2[i],second.getOrDefault(words2[i], 0) + 1);
        }
        int count=0;
        for(String word : second.keySet()) {
            if(first.containsKey(word)) {
                if(first.get(word) == 1 && second.get(word) == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}