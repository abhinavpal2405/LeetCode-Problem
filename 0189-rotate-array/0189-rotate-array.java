class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1 - k); 
        reverse(nums, 0, n - 1);    
    }
    public void reverse(int arr[], int k, int index) {
        while (k < index) {
            int swap = arr[k];
            arr[k] = arr[index];
            arr[index] = swap;
            k++;
            index--;
        }
    }
}