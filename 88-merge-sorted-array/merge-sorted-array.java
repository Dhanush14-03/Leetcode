class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;i<nums1.length;j++,i++){
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}