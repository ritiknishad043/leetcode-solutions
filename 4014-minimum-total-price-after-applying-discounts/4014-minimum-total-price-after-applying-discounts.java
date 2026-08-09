class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p=prices.length-1;
        int d=discounts.length-1;
        double total=0;
        while(p>=0 && d>=0){
            total+=(prices[p]*(100.0-discounts[d]))/100;
            p--;
            d--;
        }
        while(p>=0){
            total+=prices[p];
            p--;
        }
        return total;
    }
}