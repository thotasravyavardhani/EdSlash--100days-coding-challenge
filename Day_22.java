//Day 22 of 100 days coding challenge
/*34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        a[0]=-1;
        a[1]=-1;
        if(nums.length==0)
        return a;
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
            {
            a[1]=mid;
            i=mid+1;
            }
            else if(nums[mid]>target)
            j=mid-1;
            else
            i=mid+1;
        } 
        i=0;
        j=nums.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
            {
            a[0]=mid;
            j=mid-1;
            }
            else if(nums[mid]>target)
            j=mid-1;
            else
            i=mid+1;
        } 
        return a;
    }
}