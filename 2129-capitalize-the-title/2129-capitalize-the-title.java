class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        String[] arr=title.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder word=new StringBuilder(arr[i]);
            if(word.length()>2){
                word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
            }
            ans.append(word.toString());
            if(i!=arr.length-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}