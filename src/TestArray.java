import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 342, 12, 23, 54, 7, 3};
        String[] b = {"daf", "da213", "12dda", "zda"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        Object[][] s = new Object[2][];
        s[0] = new Object[] {21, "213", "df", 231};
        System.out.println(Arrays.toString(s[0]));
    }
}
