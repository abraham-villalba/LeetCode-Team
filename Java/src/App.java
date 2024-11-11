public class App {
    public static void main(String[] args) throws Exception {
        // Best Time to Buy and Sell Stock III
        BuySellStockIII buySolution = new BuySellStockIII();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int buyResult = buySolution.solve(prices);
        System.out.println("Buy and Sell Stock III Solution: " + buyResult);

        // Patching Array
        PatchingArray patchingSolution = new PatchingArray();
        int[] nums = {1, 5, 10};
        int range = 20;
        int patchingResult = patchingSolution.solve(nums, range);
        System.out.println("Patching Array Solution: " + patchingResult);

        // Shortest Palindrome
        ShortestPalindrome palindromeSolution = new ShortestPalindrome();
        String incompletePalindrome = "aacecaaa";
        String palindromeResult = palindromeSolution.solve(incompletePalindrome);
        System.out.println("Shortest Palindrome Solution: " + palindromeResult);
    }
}
