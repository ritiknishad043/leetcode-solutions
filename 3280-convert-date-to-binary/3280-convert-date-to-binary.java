class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String[] arr=date.split("-");
        for(int i=0;i<arr.length;i++){
            int val = Integer.parseInt(arr[i]);
            StringBuilder s = new StringBuilder();
            while(val > 0){
                int rem = val % 2;
                s.append(rem);
                val = val / 2;
            }
            sb.append(s.reverse().toString());
            if(i!=arr.length-1){
                sb.append("-");
            }
        }
        return sb.toString();
    }
}