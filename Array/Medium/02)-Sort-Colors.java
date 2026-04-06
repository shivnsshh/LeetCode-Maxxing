class Solution 
{
    public void sortColors(int[] nums) 
    {
        int cz=0, c1=0, c2=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0) cz++;
            else if(nums[i]==1) c1++;
            else c2++;
        }

        int index = 0;

        // fill 0s
        for(int i=0; i<cz; i++)
            nums[index++] = 0;

        // fill 1s
        for(int i=0; i<c1; i++)
            nums[index++] = 1;

        // fill 2s
        for(int i=0; i<c2; i++)
            nums[index++] = 2;
    }
}

//https://leetcode.com/problems/sort-colors/?utm=codolio
