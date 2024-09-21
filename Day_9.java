//Day 9 of 100 days coding challenge
/*4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> obj=new ArrayList<>();
        for(int i:nums1)
        obj.add(i);
        for(int i:nums2)
        obj.add(i);
        Collections.sort(obj);
        if((obj.size() % 2 )!= 0)
         return obj.get(obj.size()/2);
        else
         return (obj.get(obj.size()/2)+obj.get((obj.size()/2)-1))/2.0;
    }
}