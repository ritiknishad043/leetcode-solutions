class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        HashMap<String,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        int place=0;
        for(int i=0;i<n;i++){
            if(freq.get(arr[i])==1){
                place++;
                if(place==k){
                    return arr[i];
                }
            }
        }
        return "";
    }
}