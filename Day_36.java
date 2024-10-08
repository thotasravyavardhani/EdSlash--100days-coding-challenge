//Day 36 of 100 Days Coding challenge
/*1491. Average Salary Excluding the Minimum and Maximum Salary

You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
 */
class Solution {
    public double average(int[] salary) {
        int m1=Integer.MAX_VALUE,m2=Integer.MIN_VALUE;
        for(int i:salary)
        {
            if(i>m2)
            m2=i;
            if(i<m1)
            m1=i;
        }
        double c=0,s=0;
        for(int i:salary)
        {
            if(i!=m1 && i!=m2)
            {
                System.out.println(i);
                c+=1;
                s+=i;
            }
        }
        return s/c;

    }
}