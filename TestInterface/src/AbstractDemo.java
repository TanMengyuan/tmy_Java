/**
 * @Author: mengyuan.tan
 * @Date: 2019/07/30 18:40
 */
public class AbstractDemo {

    public static void main(String [] args)
    {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3);
        Employee e = new Salary("John Adams", "Boston, MA", 2);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
