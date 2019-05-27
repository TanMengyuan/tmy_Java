import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] shuru = new int[s.length];
        for (int i = 0; i < shuru.length; i++)
        {
            shuru[i] = Integer.valueOf(s[i]);
        }
        int[] copy = new int[s.length];
        for (int i = 0; i < s.length; i++)
        {
            copy[i] = shuru[i];
        }
        int result=yuesefu(shuru[s.length-1]+1);
        for(int j=0;j<s.length;j++)
        {
            if(copy[j]==result)
            {
                System.out.println(j);
            }
        }


    }

    public static int yuesefu(int n)
    {
        int temp = 2;
        List<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            alist.add(i);

        int index = -1;
        while (alist.size() > 1)
        {
            index = (index + temp) % alist.size();
            alist.remove(index);
            index--;
            temp++;
        }
        return alist.get(0);

    }

}