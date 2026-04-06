class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int max = arr[n - 1];
        list.add(max);  // add last element first
        
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] >= max) {
                max = arr[i];
                list.add(max);
            }
        }
        
        Collections.reverse(list); // 🔥 FIX
        return list;
    }
}

//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
