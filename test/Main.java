import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        System.out.println(func(str));
    }

    public static String func(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> qe=new Stack<>();
        Stack<Integer> sk=new Stack<Integer>();
        char a;
        int count=str.length();
        for(int i=0;i<count;i++){
            a=str.charAt(i);
            qe.push(a);
            if(a=='('){
                sk.push(i);
            }
            if(a==')'){
                int m=sk.pop();
                if(sk.size()==0) {
                    for (int k = 0; k < (i - m + 1); k++)
                        qe.pop();
                }
            }
            if(a=='<'){
                if(sk.size()!=0) continue;
                qe.pop();
                qe.pop();
            }
        }
        for(char c:qe){
            sb.append(c);
        }
        return sb.toString();
    }
}