class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0, area = 0;
        for (int[] d : dimensions) {
            int diagonal = d[0]*d[0] + d[1]*d[1];
            int a = d[0]*d[1];
            if (diagonal > max || (diagonal == max && a > area)) {
                max = diagonal;
                area = a;
            }
        }
        return area;
    }
}
