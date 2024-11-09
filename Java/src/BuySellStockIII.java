public class BuySellStockIII {
    public int solve(int[] prices) {
        int days = prices.length;
        int[] leftProfits = new int[days];
        int[] rightProfits = new int[days];

        int minPriceBuy = prices[0];
        for (int i = 1; i < days; i++) {
            minPriceBuy = Math.min(minPriceBuy, prices[i]);
            leftProfits[i] = Math.max(leftProfits[i-1], prices[i] - minPriceBuy);
        }

        int maxPriceSell = prices[days - 1];
        for (int i = days - 2; i >= 0; i--) {
            maxPriceSell = Math.max(maxPriceSell, prices[i]);
            rightProfits[i] = Math.max(rightProfits[i + 1], maxPriceSell - prices[i]);
        }

        int maxProfit = rightProfits[0];
        for (int i = 0; i < days - 1; i++)
            maxProfit = Math.max(maxProfit, leftProfits[i] + rightProfits[i + 1]);

        return maxProfit;
    }
}
