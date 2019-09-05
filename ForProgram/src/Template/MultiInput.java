package Template;

import java.util.Arrays;
import java.util.Scanner;

public class MultiInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
