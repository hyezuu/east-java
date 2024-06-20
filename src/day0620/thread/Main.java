package day0620.thread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2());

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}
