public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 5, 4, 7, 15, 4, 6, 77, 55, 44, 35};
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
    }
}
