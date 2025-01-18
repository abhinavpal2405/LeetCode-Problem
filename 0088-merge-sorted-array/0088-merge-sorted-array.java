class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1 = m - 1;
        int num2 = nums2.length - 1;
        int w = m + n - 1;
        while( w >= 0 ){
            if(num1 >= 0 && num2 >= 0){
                nums1[w]=nums1[num1] > nums2[num2] ? nums1[num1--] : nums2[num2--];

            }
            else if(num1 >= 0){
                nums1[w] = nums1[num1--];
            }else{
                nums1[w] = nums2[num2--];
            }
            w--;
        }
    }
}