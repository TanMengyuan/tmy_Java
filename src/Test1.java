import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main (String[] args) {
        int i = 0;
        while (0 >= ++i) {
            System.out.println("111");
        }
    }

    synchronized void setA() throws Exception{
        Thread.sleep(1000);
        setB();
    }

    synchronized void setB() throws Exception{
        Thread.sleep(1000);
    }

}

