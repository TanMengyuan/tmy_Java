import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    private static int schedule(int m, int[] array) {
        int sum = 0;
        int tmp = array.length / m;
        for (int value : array) {
            sum += value;
        }
        int index = 0;
        int tmpSum = 0;
        int out = 0;
        while (index <= array.length - 1) {
            if (tmpSum <= tmp) {
                tmpSum = tmpSum + array[index];
                index += 1;
            } else {
                if (out < tmpSum) {
                    out = tmpSum;
                }
                tmpSum = 0;
            }
        }

        return out;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(res);
    }
}