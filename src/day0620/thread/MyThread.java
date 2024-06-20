package day0620.thread;

public class MyThread extends Thread{ ;

    @Override
    public void run() {
        try {
            while (true) Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("예외발생!");
        }
        System.out.println("Woke Up!!!");
    }
}
