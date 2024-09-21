//Day 20 of 100 days coding challenge
/*1394. Find Lucky Integer in an Array

Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.

 

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.*/
import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!obj.containsKey(arr[i]))
            obj.put(arr[i],1);
            else
            obj.put(arr[i],obj.get(arr[i])+1);
        }
        int a[]=new int[arr.length];
        int j=0;
        for(int i:obj.keySet())
            if(i==obj.get(i))
            {
            a[j]=i;
            j++;
            }
        System.out.println(Arrays.toString(a));
        if(j==0)
        return -1;
        else
        {
        int m=a[0];
        for(int i:a)
        if(i>m)
        m=i;
        return m;
    }}
}
