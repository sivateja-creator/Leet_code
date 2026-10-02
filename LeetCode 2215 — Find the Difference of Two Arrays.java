class Solution {
    public java.util.List<java.util.List<Integer>> findDifference(int[] nums1, int[] nums2) {
        java.util.Set<Integer> a = new java.util.HashSet<>();
        java.util.Set<Integer> b = new java.util.HashSet<>();

        for (int n : nums1) a.add(n);
        for (int n : nums2) b.add(n);

        java.util.List<Integer> x = new java.util.ArrayList<>(a);
        x.removeIf(b::contains);

        java.util.List<Integer> y = new java.util.ArrayList<>(b);
        y.removeIf(a::contains);

        return java.util.Arrays.asList(x, y);
    }
}
