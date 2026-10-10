class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = k, count = 0;
        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') count++;
            if (i >= k && blocks.charAt(i-k) == 'W') count--;
            if (i >= k-1) min = Math.min(min, count);
        }
        return min;
    }
}
