class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> unique=new HashSet<>();
        HashSet<Integer> uniquevalue=new HashSet<>();
        for(int num:arr){
            unique.add(num);
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        for (int num : map.keySet()) {
            if (!uniquevalue.add(map.get(num))) {
                return false;
            }
        }
        return true;
    }
}