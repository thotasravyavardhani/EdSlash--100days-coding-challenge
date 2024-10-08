//Day 14 of 100 days coding challenge
/*

238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/
import java.util.*;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int r[]=new int[nums.length];
        r[nums.length-1]=1;
        int l[]=new int[nums.length];
        l[0]=1;
        int re[]=new int[nums.length];
        for(int i=1;i<nums.length;i++)
            l[i]=nums[i-1]*l[i-1];
        for(int i=nums.length-2;i>=0;i--)
            r[i]=nums[i+1]*r[i+1];
        for(int i=0;i<nums.length;i++)
            re[i]=l[i]*r[i];
        return re;
    }
}