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

    public static void main(String[] args) {
        StockBuyAndSell sbs = new StockBuyAndSell();
        int[] arr={1,2,3,4,5,6,7};
        int maximumProfit=sbs.maximumProfit(arr);
        System.out.println("Maximum profit will be :"+maximumProfit);
    }
}
