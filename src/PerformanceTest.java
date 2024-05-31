public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // StringBuilder 성능 테스트
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder 걸린 시간: " + (endTime - startTime) + " ns");

        // StringBuffer 성능 테스트
        StringBuffer sbf = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sbf.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer 걸린 시간: " + (endTime - startTime) + " ns");
    }
}
