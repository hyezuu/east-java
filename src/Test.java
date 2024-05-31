import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

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

    String c = "a:b:c:d";
    StringTokenizer st = new StringTokenizer(c,":");
    while (st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }
    String[] split = a.split(":");
    System.out.println(String.format("%d...%s...%b...%c",10,"안녕",2,'a'));

    String name1 = "Tim";
    int age1 = 30;

    String name2 = "Anna";
    int age2 = 45;

    String.format("$s의 나이는 %s세 입니다", name1, age1);
    String.format("$s의 나이는 %s세 입니다", name2, age2);
  }
}
