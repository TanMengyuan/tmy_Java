public class HelloWorld {


    public static void main(String []args){
        int a = 2;
        Emm e = new Emm(20, 80);
        Emm.tmp();
        System.out.println(a);
        System.out.println("Hello World");
    }

    public static void tmp(){
        System.out.println("This is in a static function.");
    }
}

class Emm extends HelloWorld{
    int age;
    int score;
    public Emm(int x, int y){
        this.age = x;
        this.score = y;
    }
}