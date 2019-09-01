public class Main {

    private static int k = 2;

    public static void main(String[] args) {
        System.out.println(Solution(1, 3));
    }

    public static int Solution(int a, int b) {
        int res = 0;
        for (int i = a; i <= b; i++) {
            res += fun(i);
        }

        return res;
    }

    public static int fun(int length) {
        int sum = 1;
        int pn = length / k;
        sum += pn * (length + 1) - k * (1 + pn) * pn / 2;

        return sum;
    }
}

