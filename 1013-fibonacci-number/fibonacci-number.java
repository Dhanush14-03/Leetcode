class Solution {
    public int fib(int n) {
        int a=0,b=1;
        int sum=0;
        if(n==0 || n==1){
            return n;
        }
        for(int i=0;i<n-1;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}