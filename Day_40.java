//Day 40 of 100 Days Coding challenge
/*128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9*/
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> obj=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        obj.put(nums[i],false);
        for(int i:obj.keySet())
            if(obj.containsKey(i-1)==false)
                obj.put(i,true);
        int m=0;
        for(int i:obj.keySet())
        {
            int k=1;
            if(obj.get(i)==true)
            while(obj.containsKey(i+k)==true)
            k++;
            m=Math.max(m,k);
        }
        return m;
    }
}
