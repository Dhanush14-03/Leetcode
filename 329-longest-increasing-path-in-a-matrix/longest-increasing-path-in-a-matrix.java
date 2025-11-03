class Solution {
    int[][] memo;
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        memo=new int[m][n];
        int maxlen=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                maxlen=Math.max(maxlen,dfs(matrix,i,j));
            }
        }
        return maxlen;
    }
    public int dfs(int[][] matrix,int i,int j){
        if(memo[i][j]!=0) return memo[i][j];
        int max=1;
        for(int[] d:dir){
            int x=i+d[0],y=j+d[1];
            if(x>=0 && y>=0 && x<m && y<n && matrix[x][y]>matrix[i][j]){
                max=Math.max(max,1+dfs(matrix,x,y));
            }
        }
        return memo[i][j]=max;
    }
}