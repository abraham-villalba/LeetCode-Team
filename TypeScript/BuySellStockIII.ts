function maxProfit(prices: number[]): number {
    const days = prices.length;
    // Maximum profits up to the i-th day for the first transaction     
    const leftProfits : number[] =  new Array(days).fill(0);
    // Maximum profits from the i-th day to the last for the second transaction  
    const rightProfits : number[] = new Array(days).fill(0);

    // We first consider the first element to have the smallest price
    let minPriceBuy = prices[0];
    for (let i = 1; i < days; i++) {
        minPriceBuy = Math.min(minPriceBuy, prices[i]);
        leftProfits[i] = Math.max(leftProfits[i - 1], prices[i] - minPriceBuy);
    }

    // Consider the first (last) element to have the best price to sell.
    let maxPriceSell = prices[days - 1];
    for (let i = days - 2; i >= 0; i--) {
        maxPriceSell = Math.max(maxPriceSell, prices[i]);
        rightProfits[i] = Math.max(rightProfits[i + 1], maxPriceSell - prices[i]);
    }

    // Only one transaction
    let max_profit = rightProfits[0];
    // Review possible combinations for two transactions        
    for (let i = 0; i < days - 1; i++) {
        max_profit = Math.max(max_profit, leftProfits[i] + rightProfits[i + 1]);
    }

    return max_profit;
};