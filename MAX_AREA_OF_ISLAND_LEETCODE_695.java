class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int maxarea = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int area = dfs(grid,i,j);
                maxarea = Math.max(area,maxarea);

            }
            
        }
        return maxarea;
        
    }
    int dfs(int[][] grid , int r , int c){

        if(r<0 || r>=grid.length || c<0 || c>= grid[0].length) return 0;
        if(grid[r][c]== 0) return 0;

        grid[r][c] = 0;

        int area = 1;
        area += dfs(grid,r-1,c);
        area += dfs(grid,r+1,c);
        area += dfs(grid,r,c-1);
        area += dfs(grid,r,c+1);

        return area;
    }
}
