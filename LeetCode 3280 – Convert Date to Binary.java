class Solution {
    public String convertDateToBinary(String date) {
        String[] a = date.split("-");
        return Integer.toBinaryString(Integer.parseInt(a[0])) + "-" +
               Integer.toBinaryString(Integer.parseInt(a[1])) + "-" +
               Integer.toBinaryString(Integer.parseInt(a[2]));
    }
}
