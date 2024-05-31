import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    double[] arr2 = {1, 2, 3, 4, 5, 5.5};

    List<Integer> list = Arrays.asList(1);
    System.out.println(list.get(0));
    System.out.println(arr);//주소값
    int[] arr3 = new int[2];

    String str = new String("dsd");
    System.out.println(str);
  }
}
