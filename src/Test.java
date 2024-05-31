import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    //    int[] arr = {1, 2, 3, 4, 5};
    //    double[] arr2 = {1, 2, 3, 4, 5, 5.5};
    //
    //    List<Integer> list = Arrays.asList(1);
    //    System.out.println(list.get(0));
    //    System.out.println(arr);//주소값
    //    int[] arr3 = new int[2];
    //
    //    String str = new String("dsd");
    //    System.out.println(str);

//    String findChar = "what is your hobby";
    //    for(int i=findChar.length()-5; i<findChar.length(); i++){
    //      System.out.print(findChar.charAt(i));
    //    }
//    System.out.print(
//        findChar.charAt(13)
//            + ""
//            + findChar.charAt(14)
//            + ""
//            + findChar.charAt(15)
//            + ""
//            + findChar.charAt(16)
//            + ""
//            + findChar.charAt(17));
    String a = "Hello World! Hello World! Hello World! Hello World!";
    System.out.println(a.replaceAll("World", "Java"));
    System.out.println(a.replaceAll("World", "Java"));

    String b = "WEEEE ASKE ;ND";
    System.out.println(b.substring(0,3)+b.substring(8,10)+b.substring(12,14));


  }
}
