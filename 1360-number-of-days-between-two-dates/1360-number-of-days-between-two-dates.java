class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(Days(date2)-Days(date1));
    }
    int Days(String date){
        String[] arr= date.split("-");
        int year=Integer.valueOf(arr[0]);
        int month=Integer.valueOf(arr[1]);
        int day=Integer.valueOf(arr[2]);
        int totalsum=0;
        totalsum+=(year-1900)*365;
        int leapdays=0;
        for(int i=1900;i<year;i++){
            if((i%4==0 && i%100!=0) || i%400==0){
                leapdays++;
            }
        }
        totalsum+=leapdays;
        for(int i=1;i<month;i++){
            if(i==2){
                if ((year%4==0 && year%100!=0) || year%400==0){ 
                    totalsum+=29;
                }
                else{
                    totalsum+=28;
                }
            }
            else if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                totalsum+=31;
            }
            else{
                totalsum+=30;
            }
        }
        totalsum+=day;
        return totalsum;
    }
}