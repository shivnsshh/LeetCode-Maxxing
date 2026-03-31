class Solution {
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // index where found
            }
        }
        return -1; // not found
    }
}

//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
