class Solution {
    public int removeDuplicates(int[] nums) {
        
        //j is the explorer
        //i is the builder

        int i = 0; // first element is always unique

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) 
            {
                i++;
                nums[i]= nums[j];
            }
        }

        return i+1;
    }
}
