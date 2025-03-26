package Day7;

public class StockBuyAndSell {
    public int maximumProfit(int prices[]) {
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]) max+=prices[i]-prices[i-1];
        }
        return max;
    }

    public static void main(String[] args) {
        StockBuyAndSell sbs = new StockBuyAndSell();
        int[] arr={1,2,3,4,5,6,7};
        int maximumProfit=sbs.maximumProfit(arr);
        System.out.println("Maximum profit will be :"+maximumProfit);
    }
}
