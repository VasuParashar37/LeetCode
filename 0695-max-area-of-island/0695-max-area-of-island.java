class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int maxSum = 0;
        for(int row = 0; row<R;row++){
            for(int col = 0; col<C;col++){
                if(grid[row][col]==1){
                    int sum = bfs(grid, row, col, R, C);
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }
    private int bfs(int[][]grid, int row, int col, int R, int C){
        int sum = 1;
        grid[row][col] = 0;
        int[] rdiff = {-1,1,0,0};
        int[] cdiff = {0,0,-1,1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
           int[] pair = q.poll();
            row = pair[0]; col = pair[1];
            for(int i=0;i<4;i++){
                int ar = row+rdiff[i];
                int ac = col+cdiff[i];
                if(ar>=0 && ar<R && ac>=0 && ac<C && grid[ar][ac] != 0){
                    grid[ar][ac] = 0;
                    q.add(new int[]{ar,ac});
                    sum++;
                }
            }
        }
        return sum;
    }
}