class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]={-1,-1};
        if(nums.length==0){
            return result;
        }
        int arr[]=new int [2];
        int count =0;
        if(target>=0){
            for(int i =0;i<nums.length;i++){
                if(nums[i]==target){
                arr[0]=i;
                count++;
                break;
                }

            }
            for(int j=nums.length-1; j>=0;j--){
                if(nums[j]==target){
                arr[1]=j;
                count++;
                break;
                }
            }
            if(count>0){
                return arr;
            }
            return result;
        }
        
        return result;
    }
}