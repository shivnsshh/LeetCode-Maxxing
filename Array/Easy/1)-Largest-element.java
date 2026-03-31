class Solution {
    public int largest(int[] arr) {
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}

//http://geeksforgeeks.org/problems/largest-element-in-array4009/1
