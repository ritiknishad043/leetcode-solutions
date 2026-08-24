class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=0;
        int costSum=0;
        for(int i=0;i<gas.length;i++){
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(gasSum<costSum){
            return -1;
        }
        int currentGas=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            currentGas+=gas[i]-cost[i];
            if(currentGas<0){
                currentGas=0;
                index=i+1;
            }
        }
        return index;
    }
}