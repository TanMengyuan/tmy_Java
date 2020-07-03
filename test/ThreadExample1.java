public class ThreadExample1 {

    public static void main(String[] args) {
        Thread aThread = new ThreadA();
        Thread bThread = new ThreadB();
        aThread.start();
        bThread.run();
        System.out.println("C");

    }
}

class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.print("A");
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.print("B");
    }
}