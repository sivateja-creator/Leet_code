class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
