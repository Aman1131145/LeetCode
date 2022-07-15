class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int area = area(grid,i,j,visited);
                    if(area > max){
                        max = area;
                    }
                }
            }
        }
        return max;
    }
    public int area(int grid[][],int i, int j, boolean visited[][]){
        if(i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1){
            return 0;
        }
        if(grid[i][j] == 0 || visited[i][j] == true ){
            return 0;
        }
        
        visited[i][j] = true;
        int left = area(grid,i-1,j, visited);
        int right = area(grid,i+1,j, visited);
        int up = area(grid,i,j-1, visited);
        int down = area(grid,i,j+1, visited);
        return grid[i][j]+left+right+up+down;
    } 
}