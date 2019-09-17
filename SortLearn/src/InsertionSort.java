import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = new int[]{23, 42, 65, 8, 32, 56, 4, 9};
        int[] res = Solution(a);
        System.out.println(Arrays.toString(res));
    }

    private static int[] Solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int preIndex = i;
            int curNum = arr[i + 1];
            while (preIndex >= 0 && curNum < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = curNum;
        }
        return arr;
    }
}
