package Day7;

public class StockBuyAndSell {
    public int maximumProfit(int prices[]) {
        int maxprofit =0;
        int n=prices.length;
        int buy=0,sell=0;
        for(int i=1;i<n;i++){
            if(prices[i-1]>prices[i]){
                maxprofit+=prices[i-1]-prices[buy];
                buy=i;
            }
        }
        sell=n-1;
        maxprofit+=prices[sell]-prices[buy];
        return maxprofit;
    }
}
