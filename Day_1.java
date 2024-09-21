// Day 1 of 100 days coding challenge
/* 9. Palindrome Number
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */

class Solution {
    public boolean isPalindrome(int x) {
       int t=0,a=x;
       if(x<0) 
       return false;
       for(;x!=0;x/=10)
       {
        int r=x%10;
        t=(t*10)+r;
       }
       if(a==t)
       return true;
       else
       return false;
    }
}