class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalapple=0;
        for(int i=0;i<apple.length;i++){
            totalapple+=apple[i];
        }
        Arrays.sort(capacity);
        int boxcapacity=0;
        int box=0;
        for(int i=capacity.length-1;i>=0;i--){
            boxcapacity+=capacity[i];
            box++;
            if(boxcapacity>=totalapple){
                return box;
            }
        }
        return box;
    }
}