public class buyAndSell {
    public static int BuySellStock(int[] Stocks) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < Stocks.length; i++) {
            // min = Math.min(min, A[i]);
            if(buyPrice < Stocks[i]) {
                int profit = Stocks[i] - buyPrice;
                buyPrice = Math.min(buyPrice, Stocks[i]);
                maxProfit = Math.max(maxProfit, profit);
            } 
            else {
                buyPrice = Stocks[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] Stocks = {7, 1, 5, 3, 6, 4};
        System.out.println(BuySellStock(Stocks));
    }
}
