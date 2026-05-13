class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int initial = image[sr][sc];
        if(initial==color)return image;
        int[]row = {1,-1,0,0};
        int[]col = {0,0,-1,1};
        Queue<int[]>q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        while(!q.isEmpty()){
            int[]cell = q.poll();
            int i = cell[0];
            int j = cell[1];
            image[i][j]=color;
            for(int k=0;k<4;k++){
                int r = i+row[k];
                int c = j+col[k];
                if(r>=0 && r<n && c>=0 && c<m && image[r][c]==initial){
                    q.offer(new int[]{r,c});
                    image[r][c] = color;
                }
            }
        }
        return image;
    }
}