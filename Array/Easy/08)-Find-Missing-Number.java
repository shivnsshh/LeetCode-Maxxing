class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int s1=0;
        int s2=0;
        int n=nums.length;

        for(int i=0; i<n;i++)
        {
            s1=s1+nums[i];
        }
        for(int i=1; i<=n; i++)
        {
            s2=s2+i;
        }
        return s2-s1;
    }
}
//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
