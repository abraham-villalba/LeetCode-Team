function shortestPalindrome(s: string): string {
    let longestPalindromeIndex = 0;
    for(let i = 0; i < s.length; i++) {
        if (isPalindrome(s,0,i)) longestPalindromeIndex = i;
    }
    const remaining = s.substring(longestPalindromeIndex + 1);
    const reversedRemaining = reverseString(remaining);
    return reversedRemaining + s;


};

function isPalindrome(s: string, start: number, end: number) {
    let left = 0;
    let right = end;
    while( left <= right)  {
        if( s[left] !== s[right] ) return false;
        left++;
        right--;
    }
    return true;
}

function reverseString(s: string) {
    let reversed = "";
    for( let i = s.length - 1; i >= 0; i-- ) {
        reversed += s[i];
    }
    return reversed;
}