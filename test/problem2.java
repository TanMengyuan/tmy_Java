public class problem2 {
    /**
     *
     * @param n int整型 第n天
     * @return int整型
     */
    public static int solution(int n) {
        // write code here
        int result = 0;
        int num = 1;
        while (n > 0) {
            if (n > num) {
                result += num * num;
            } else {
                result += n * num;
            }
            n -= num;
            num++;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(solution(11));
    }
}
