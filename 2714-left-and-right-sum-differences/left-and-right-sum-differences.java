class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rsum=0;
        int n=nums.length;
        int[] ans=new int[n];
        for(int num:nums){
            rsum+=num;
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            rsum-=nums[i];
            ans[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return ans;
    }
}