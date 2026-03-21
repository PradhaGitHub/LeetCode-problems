class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] arr=new int[grid.length][grid[0].length];
        int m=x+k;
        for(int i=0;i<grid.length;i++){
            if(i>=x&&i<=x+k)m--;
            for(int j=0;j<grid[0].length;j++){
                if(i>=x&&i<x+k){
                    if(j>=y&&j<y+k){
                        arr[i][j]=grid[m][j];
                    }
                    else{
                        arr[i][j]=grid[i][j];
                    }
                }
                else{
                    arr[i][j]=grid[i][j];
                }
            }            
        }
        return arr;
    }
}