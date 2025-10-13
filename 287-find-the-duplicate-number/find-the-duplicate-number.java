class Solution {
    public int findDuplicate(int[] nums) {
        int first=nums[0];
        int last=nums[0];
        do{
            first=nums[first];
            last=nums[nums[last]];
        }while(first!=last);
        first=nums[0];
        while(first!=last){
            first=nums[first];
            last=nums[last];
        }
        return first;
    }
}