class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        days = len(prices)
        # Maximum profits up to the i-th day for the first transaction        
        leftProfits = [0] * days
        # Maximum profits from the i-th day to the last for the second transaction        
        rigthProfits = [0] * days

        # We first consider the first element to have the smallest price
        minPriceBuy = prices[0]
        for i in range(1,days):
            minPriceBuy = min(minPriceBuy, prices[i])
            leftProfits[i] = max(leftProfits[i-1],prices[i] - minPriceBuy)
 
        # Consider the first (last) element to have the best price to sell.
        maxPriceSell = prices[-1]
        for i in range(days - 2, -1, -1):
            maxPriceSell = max(maxPriceSell, prices[i])
            rigthProfits[i] = max(rigthProfits[i+1],maxPriceSell - prices[i])
        
        # Only one transaction
        maxProfit = rigthProfits[0]
        # Review possible combinations for two transactions        
        for i in range(days - 1):
            maxProfit = max(maxProfit, leftProfits[i] + rigthProfits[i + 1])

        return maxProfit
