public class PerformanceTest {
  public static void main(String[] args) {
    //        long startTime, endTime;
    //
    //        // StringBuilder 성능 테스트
    //        StringBuilder sb = new StringBuilder();
    //        startTime = System.nanoTime();
    //        for (int i = 0; i < 100000; i++) {
    //            sb.append("test");
    //        }
    //        endTime = System.nanoTime();
    //        System.out.println("StringBuilder 걸린 시간: " + (endTime - startTime) + " ns");
    //
    //        // StringBuffer 성능 테스트
    //        StringBuffer sbf = new StringBuffer();
    //        startTime = System.nanoTime();
    //        for (int i = 0; i < 100000; i++) {
    //            sbf.append("test");
    //        }
    //        endTime = System.nanoTime();
    //        System.out.println("StringBuffer 걸린 시간: " + (endTime - startTime) + " ns");

    //    int[] arr = new int[12];
    //
    //    System.out.println(arr);
    //    System.out.println(System.identityHashCode(arr[0]));
    //    System.out.println(System.identityHashCode(arr[1]));
    //    System.out.println(System.identityHashCode(arr[2]));

    String[] arr = new String[100];
    try {
      System.out.println(arr[0].length());
    } catch (NullPointerException e) {
      throw new RuntimeException("널 위한 예외처리 ㅋ");
    }
  }
}
