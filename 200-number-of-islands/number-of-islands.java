class Solution {
    class Pair {
        int first = 0;
        int second = 0;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void bfs(int[][] visitor, int row, int col, char[][] grid) {
        visitor[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Pair current = q.poll();
            int r = current.first;
            int c = current.second;

            for (int i = 0; i < 4; i++) {
                int a = r + dRow[i];
                int b = c + dCol[i];

                if (a >= 0 && a < grid.length && b >= 0 && b < grid[0].length 
                    && visitor[a][b] == 0 && grid[a][b] == '1') {
                    visitor[a][b] = 1;
                    q.add(new Pair(a, b));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int[][] visitor = new int[grid.length][grid[0].length];
        int count = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (visitor[row][col] == 0 && grid[row][col] == '1') {
                    count++;
                    bfs(visitor, row, col, grid);
                }
            }
        }
        return count;
    }
}
