class Solution {
    public int[] leftRightDifference(int[] nums) {
       int l=0;
       int r=0;
       int arr[]= new int[nums.length];
       for(int i=0;i<nums.length;i++){
        r += nums[i];
       }
       for(int i =0;i<nums.length;i++){
        r -= nums[i];
        arr[i]=Math.abs(l-r);
        l += nums[i];
       }
       return arr;
    }
}