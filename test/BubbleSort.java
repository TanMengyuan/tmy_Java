import java.lang.reflect.Array;
import java.util.SortedSet;

public class BubbleSort {
    public static void bubbleSort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0; i < size - 1; i++)
        {
            for(int j = 0; j < size - 1 - i; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int[] numbers)
    {
        for(int i = 0 ; i < numbers.length ; i ++ )
        {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] a = {6, 3, 4, 2, 5, 1};
        printArr(a);
        bubbleSort(a);
        printArr(a);
    }
}