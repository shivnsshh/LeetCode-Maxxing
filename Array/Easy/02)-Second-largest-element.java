class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1, second = -1;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } 
            else if (num < max && num > second) {
                second = num;
            }
        }

        return second;
    }
}

//https://www.geeksforgeeks.org/problems/second-largest3735/1
