class Solution {
    public int lastStoneWeight(int[] stones) {
        java.util.PriorityQueue<Integer> q =
            new java.util.PriorityQueue<>((a,b) -> b-a);
        for (int x : stones) q.add(x);
        while (q.size() > 1) {
            int a = q.poll(), b = q.poll();
            if (a != b) q.add(a - b);
        }
        return q.isEmpty() ? 0 : q.poll();
    }
}
