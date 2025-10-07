class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            int digits=0;
            int num=nums[i];
            while(num!=0){
                digits++;
                num/=10;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}