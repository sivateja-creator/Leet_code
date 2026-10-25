class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = (int) s.chars().filter(c -> c == '1').count();
        return "1".repeat(ones - 1) + "0".repeat(s.length() - ones) + "1";
    }
}
