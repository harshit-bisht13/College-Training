public class Best_Time_to_sell_or_buy_stock(121) {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max_Profit=0;
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-min;
            if(profit>max_Profit){
                max_Profit=Math.max(max_Profit, profit);
            }
        }
        return max_Profit;
    }
}
