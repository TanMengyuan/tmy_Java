import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] a = {1, 2, 3};
        Solution1 s = new Solution1();
        int res = s.findMin(a);
        System.out.println(res);
        System.out.println(Arrays.toString(a));
        int[] new_a = Arrays.copyOfRange(a, 1, 2);
        System.out.println(Arrays.toString(new_a));
    }
}

class Solution1 {
    public int findMin(int[] nums) {
//        Integer[] a = {1, 23, 3, 4};
        return (int) Arrays.stream(nums).min().getAsInt();
    }
}