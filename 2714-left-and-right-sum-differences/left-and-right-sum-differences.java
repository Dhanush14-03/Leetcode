class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        int n=nums.length;
        int[] ans=new int[n];
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<n;i++){
            int lsum=0,rsum=0;
            for(int j=i+1;j<n;j++){
                rsum+=nums[j];
            }
            lsum=sum-rsum-nums[i];
            ans[i]=Math.abs(lsum-rsum);
        }
        return ans;
    }
}