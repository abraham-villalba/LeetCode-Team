public class ShortestPalindrome {
    private boolean isPalindrome(String str, int start, int end) {
        int left = start;
        int right = end;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true; 
    }


    public String solve(String incompletePalindrome) {
        int longestPalindromeIndex = 0;

        for (int i = 0; i < incompletePalindrome.length(); i++) {
            if (isPalindrome(incompletePalindrome, 0, i))
                longestPalindromeIndex = i;
        }

        String remaining = incompletePalindrome.substring(longestPalindromeIndex + 1);
        String reversedRemaining = new StringBuilder(remaining).reverse().toString();

        return reversedRemaining + incompletePalindrome;
    }
}
