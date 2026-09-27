class OrderedStream {
    String[] arr;
    int ptr = 1;

    public OrderedStream(int n) {
        arr = new String[n + 1];
    }

    public java.util.List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        java.util.List<String> ans = new java.util.ArrayList<>();
        while (ptr < arr.length && arr[ptr] != null)
            ans.add(arr[ptr++]);
        return ans;
    }
}
