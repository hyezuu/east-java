package day0620.thread;

public class Test {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("스레드");
        MyThread myThread1 = new MyThread("스레드1");
        MyThread myThread2 = new MyThread("스레드2");
        MyThread myThread3 = new MyThread("스레드3");
        MyThread myThread4 = new MyThread("스레드4");
        //스레드 실행은 start로 한다 -> run 자동호출
//        myThread.run();
        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        //출력은 무작위로.. 스레드는 무작위로 실행된다. 비동기적으로

    }
}
