class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length, sum = 0;
        boolean[] seen = new boolean[n * n + 1];
        int repeat = 0;
        for (int[] row : grid)
            for (int x : row) {
                if (seen[x]) repeat = x;
                seen[x] = true;
                sum += x;
            }
        int missing = n * n * (n * n + 1) / 2 - (sum - repeat);
        return new int[]{repeat, missing};
    }
}
