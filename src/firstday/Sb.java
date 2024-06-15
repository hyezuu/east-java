package firstday;

public class Sb {
  public static void main(String[] args) {
//    StringBuilder sb = new StringBuilder();
//    sb.append("Hello World");
//    sb.append("!");
//    System.out.println(sb);
//
//    StringBuffer sf = new StringBuffer();
//    sf.append("Hello World");
//    sf.append("!");
//    sf.insert(0, "Hey ! ");
//    System.out.println(sf);
//    int[] arr = new int[100];
//    String[] arr2 = new String[1000];
//    System.out.println(arr2[1000]);
//    int positive = 10;
//    int negative = -10;
//
//    System.out.println("양의 부호 연산자 적용: " + positive);
//    System.out.println("음의 부호 연산자 적용: " + -positive);
//    System.out.println("음의 부호 연산자로 부호 반전: " + negative);
//    System.out.println("음의 부호 연산자로 다시 부호 반전: " + -negative);
//
//    int x = 5;
//    int y = 5;
//
//    System.out.println("전위 증가 연산자: " + (++x));
//    System.out.println("후위 증가 연산자: " + (y++));
//
//    System.out.println("==================");
//    System.out.println("x는" + x);
//    System.out.println("y는" + y);
//
//    System.out.println("전위 감소 연산자: " + (--x));
//    System.out.println("후위 감소 연산자: " + (y--));
//
//
//    int a = 100;
//    int b = 100;
//    System.out.println("a는" + a);
//    System.out.println("b는" + b);
//
//    System.out.println("==================");
//
//    System.out.println("전위 감소 연산자: " + (--a));
//    System.out.println("후위 감소 연산자: " + (b--));
//    System.out.println("전위 감소 연산자: " + (--a));
//    System.out.println("후위 감소 연산자: " + (b--));
//    System.out.println("전위 감소 연산자: " + (--a));
//    System.out.println("후위 감소 연산자: " + (b--));

    boolean isRaining = true;

    if(isRaining){
      System.out.println("하늘에서 비가 와요");
    }
    if(!isRaining){
      System.out.println("김태희가..안오다니");
    }

    boolean isSunny = false;

    if(isSunny){
      System.out.println("날씨가 맑아요");
    }
    else {
      System.out.println("집에서 쉬어야죠");
    }

    String[] arr = {"apple", "apple","apple1"};

    String s1 = arr[0];
    String s2 = arr[1];

    System.out.println(s1==s2);
    System.out.println(arr[0]==arr[1]);
    System.out.println(arr[0]=="apple");
    System.out.println(arr[2].substring(0,5));
    System.out.println(arr[2].substring(0,5)=="apple");

  }
}
