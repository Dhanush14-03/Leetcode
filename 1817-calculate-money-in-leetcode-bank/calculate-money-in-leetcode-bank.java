class Solution {
    public int totalMoney(int n) {
        int count=0;
        int mon=1,val=1;
        for(int i=1;i<=n;i++){
            count+=val;
            val++;
            if(i%7==0){
                mon++;
                val=mon;
            }
        }
        return count;
    }
}