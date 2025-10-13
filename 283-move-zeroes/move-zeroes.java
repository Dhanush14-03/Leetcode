class Solution {
    public void moveZeroes(int[] nums) {
        int lastindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[lastindex]=nums[i];
                lastindex++;
            }
        }
        for(int i=lastindex;i<nums.length;i++){
            nums[i]=0;
        }
    }
}