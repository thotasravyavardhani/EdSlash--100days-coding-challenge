//Day 10 of 100 days coding challenge
/* 268. Missing Number
Solved
Easy
Topics
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums. */
class Solution {
    public int missingNumber(int[] nums) 
    {
        int max=nums[0];
        for(int i:nums)
        {
            if(i>max)
            max=i;
        }
        for(int i=0;i<=max;i++)
        {
            int c=0;
         for(int j:nums)
         {
            if(i==j)
            {
            c=1;
            break;
            }
         }   
         if(c==0)
         return i;
        }
        return max+1;
    }
}