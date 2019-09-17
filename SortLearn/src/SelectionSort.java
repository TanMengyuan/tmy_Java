import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = new int[]{23, 42, 65, 8, 32, 56, 4, 9};
        int[] res = Solution(a);
        System.out.println(Arrays.toString(res));
    }

    private static int[] Solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }

        return arr;
    }
}
