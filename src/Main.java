import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        int z;
        int x = 5;
        int y = -10;
        int a = 4;
        int b = 2;

        z = x++ - --y * b / a;

        System.out.println(z);
    }
}