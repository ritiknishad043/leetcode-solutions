class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] temp=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> rank=new HashMap<>();
        int start=1;
        for(int i=0;i<n;i++){
            if(!rank.containsKey(temp[i])){
                rank.put(temp[i],start);
                start++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=rank.get(arr[i]);
        }
        return arr;
        
    }
}