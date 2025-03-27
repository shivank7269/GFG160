package Day8;

public class StockBuyAndSellMaxOneTransactionAllowed{
    public int maximumProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for(int price : prices){
            if(price<min) min =price;
            int profit = price - min;
            if(profit>maxProfit) maxProfit=profit;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        StockBuyAndSellMaxOneTransactionAllowed s= new StockBuyAndSellMaxOneTransactionAllowed();
        int ans = s.maximumProfit(arr);
        System.out.println("Answer is :"+ans);
    }
}
