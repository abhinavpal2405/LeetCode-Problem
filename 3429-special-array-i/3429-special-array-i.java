class Solution {
    public boolean isArraySpecial(int[] nums) {
        int count=nums.length;
        for(int i=1;i<count;i++){
            if((nums[i] % 2)==(nums[i-1]%2)){
                return false;
            }
        }
        
        return true;
    }
}