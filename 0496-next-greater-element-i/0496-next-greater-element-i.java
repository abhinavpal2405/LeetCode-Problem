class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                int k;
                for( k=j+1;k<nums2.length;k++){
                    if(nums1[i]<nums2[k]){
                      list.add(nums2[k]);
                        break;
                    }
                }
                    if(k== nums2.length){
                        list.add(-1);
                        break;
                    }
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }
}