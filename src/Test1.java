public class Test1 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println((float) a / 12);
        String str1="HelloJava9";
        String str2="Hello" + "Java9";
        System.out.println(str1 == str2);
        String str3="HelloJava" + "HelloJava".length();
        System.out.println(str1 + '\n' + str3);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        short st=5;
        st+=10;
        st+=90000;
        System.out.println(st);
        System.out.println("abc\n".length());
    }

    public void Son(){
        System.out.println("Import class Test1.Son");
    }
}

