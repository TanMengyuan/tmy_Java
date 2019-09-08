import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        int i = 1;
        int j = i++;
        if ((i>++j) && (i++==j)) {
            j+=i;
        }
        System.out.println(j);
    }

}

