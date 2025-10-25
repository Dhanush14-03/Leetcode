class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        int len=list.size();
        for(int i=0;i<len;i++){
            nums[i]=list.get(i);
        }
        return len;
    }
}