class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0,sum=0;
        for(String row:bank){
            int count=0;
            for(int j=0;j<bank[0].length();j++){
                if(row.charAt(j)=='1'){
                    count++;
                }
            }
            if(count>0){
                sum+=prev*count;
                prev=count;
            }
        }
        return sum;
    }
}