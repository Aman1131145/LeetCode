class Solution {
    //     public int findPaths(int m, int n, int N, int i, int j) {
    //         if (N <= 0) return 0;
            
    //         final int MOD = 1000000007;
    //         int[][] count = new int[m][n];
    //         count[i][j] = 1;
    //         int result = 0;
            
    //         int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            
    //         for (int step = 0; step < N; step++) {
    //             int[][] temp = new int[m][n];
    //             for (int r = 0; r < m; r++) {
    //                 for (int c = 0; c < n; c++) {
    //                     for (int[] d : dirs) {
    //                         int nr = r + d[0];
    //                         int nc = c + d[1];
    //                         if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
    //                             result = (result + count[r][c]) % MOD;
    //                         }
    //                         else {
    //                             temp[nr][nc] = (temp[nr][nc] + count[r][c]) % MOD;
    //                         }
    //                     }
    //                 }
    //             }
    //             count = temp;
    //         }
            
    //         return result;
    //     }
        
        // ANOTHER APPROACH WITH LESS TIME CONSUMPTION
        int[][][] cache;
        int MOD = 1000_000_007;
        public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
            cache = new int[m][n][maxMove + 1];
            for(int[][] cc : cache) {
                for(int[] c : cc) {
                    Arrays.fill(c, -1);
                }
            }
            return f(m, n, maxMove, startRow, startColumn);
        }
        int f(int m, int n, int max, int r, int c) {
            if(r < 0 || c < 0 || r == m || c == n) {
                return 1;
            }
            if(max == 0) {
                return 0;
            }
            if(cache[r][c][max] > -1) {
                return cache[r][c][max];
            }
            long l = f(m, n, max - 1, r - 1, c) % MOD;
            l += f(m, n, max - 1, r + 1, c) % MOD;
            l += f(m, n, max - 1, r, c + 1) % MOD;
            l += f(m, n, max - 1, r, c - 1) % MOD;
            cache[r][c][max] = (int)(l % MOD);
            return cache[r][c][max];
        }
    }