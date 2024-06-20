package day0620.thread;

public class Test {

    public static void main(String[] args) {
        //익명함수로 스레드 생성하기
        Thread thread1 = new Thread() {
            public void run() {
                try {
                    while (true) Thread.sleep(1000);
                }
                catch (Exception e) {}
                System.out.println("Woke Up!!!");
            }
        };
        //시작하기 전 상태(생성 직후)
        System.out.println("thread1.getState() = " + thread1.getState());

        thread1.start();
        //시작하고 난 상태
        System.out.println("thread1.getState() = " + thread1.getState());

        //상태가 TIMED_WAITING 에 들어가면 상태 출력.(run())
        while (true) {
            if (thread1.getState() == Thread.State.TIMED_WAITING) {
                System.out.println("thread1.getState() = " + thread1.getState());
                break;
            }
        }
        //실행 직후 interrupt : 일시중지상태인 스레드를 -> 실행대기 상태로 복귀한다.
        thread1.interrupt();
        while (true) {
            if (thread1.getState() == Thread.State.RUNNABLE) {
                System.out.println("thread1.getState() = " + thread1.getState());
                break;
            }
        }

        //run()메서드가 끝나면 종료된다
        while (true) {
            if (thread1.getState() == Thread.State.TERMINATED) {
                System.out.println("thread1.getState() = " + thread1.getState());
                break;
            }

        }

    }
}
