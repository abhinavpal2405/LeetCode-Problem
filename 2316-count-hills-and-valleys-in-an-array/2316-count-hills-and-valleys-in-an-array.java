class Solution {
    public int countHillValley(int[] nums) {
        int left=0;
        int count =0;
        for(int i=0;i<nums.length-1;i++){
            if((nums[left]<nums[i]&& nums[i]>nums[i+1])||
            (nums[left]>nums[i] && nums[i]<nums[i+1])){
            count++;
            left =i;
        }
        }
        return count;
    }
}