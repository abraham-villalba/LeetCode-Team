# Provitional
# Improvement with KMP or other algorithm to find the longest palindrome within s
class Solution:
    def shortestPalindrome(self, s: str) -> str:
        def isPalindrome(string: str, start : int, end : int):
            left, right = start, end
            while left <= right:
                if string[left] != string[right]:
                    return False
                left, right = left + 1, right - 1
            return True
        # A single character is a palindrome, so the base case is, the first char is the longest palindrome
        longestPalindromeIndex = 0
        for i in range(len(s)):
            if isPalindrome(s,0,i):
                longest_palindrome_id = i
        remaining = s[longestPalindromeIndex+1:]
        reversedRemaining = remaining[::-1]
        return reversedRemaining + s
