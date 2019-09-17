import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = new int[]{23, 42, 65, 8, 32, 56, 4, 9};
        int[] res = Solution(a, 0, a.length - 1);
        System.out.println(Arrays.toString(res));
    }

    private static int[] Solution(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = Partition(arr, left, right);
            Solution(arr, left, pivotIndex - 1);
            Solution(arr, pivotIndex + 1, right);
        }
        return arr;
    }

    private static int Partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }
}
