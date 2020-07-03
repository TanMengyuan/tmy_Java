import java.util.*;


public class Solution {
    /**
     * 输入一个整形数值，返回一个整形值
     * @param n int整型 n>9
     * @return int整型
     */
    public static int solution(int n) {
        // write code here
        ArrayList<Integer> numberList = new ArrayList<>();
        int cur = 9;
        while (cur > 1) {
            if (n % cur == 0) {
                numberList.add(cur);
                n /= cur;
            } else {
                cur--;
            }
        }
        if (n > 1) {
            return -1;
        }

        return helper(numberList);
    }

    private static int helper(List<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }
        int res = 0;
        Collections.sort(list);
        for (int i: list) {
            res *= 10;
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        int result = solution(123456789);
        System.out.println(result);
    }
}