class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int list[] = new int[nums.length];
        int p[] = new int[nums.length];
        int n[] = new int[nums.length];
        int a=0,b=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
            {
                p[a++] = nums[i];
            }
            else
            {
                n[b++] = nums[i];
            }
        }

        a=0; b=0;

        for(int i=0; i<nums.length; i+=2)
        {
            list[i] = p[a++];     // even index → positive
            list[i+1] = n[b++];   // odd index → negative
        }

        return list;
    }
}

//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/?utm=codolio
