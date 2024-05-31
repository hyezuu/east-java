public class Main implements TestInterface{
  public static void main(String[] args) {
    /*
    //    int a = 51;
    //    int b = 49;
    //    System.out.println(a + b);
        //정수형 자료형
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4;
        //실수형 자료형
        float e = 0.1f; //뒤에 f 안 붙이면 에러난다
        double f = 1.2;
        //문자
        char g = 'a';
        //boolean
        boolean isTrue = true;
        boolean isFalse = false;
        //문자열
        String str = "Hello World";
    */

    /*//    int a = 1;
    //    int b = a;
    //    System.out.println(a);
    //    System.out.println(b);
        int b = 127;
        b++;
        System.out.println(b);
        //오버플로우*/

    //    char c1 = 'A';
    //    char c2 = 65;
    //    char c3 = '\u0041';
    //
    //    char c4 = '가';
    //    char c5 = 44032;
    //    char c6 = '\uac00';
    //
    //    int uniCode = c1;
    //
    //    System.out.println(c1);
    //    System.out.println(c2);
    //    System.out.println(c3);
    //    System.out.println(c4);
    //    System.out.println(c5);
    //    System.out.println(c6);
    //    System.out.println(uniCode);
    //
    //    short sVal = 10;
    //    short result = (short)(sVal+10);
    //    System.out.println(result);

    //    float myFloat = 9.75f;
    //    float anotherFloat = myFloat*2;
    //
    //    System.out.println("Original float value: " + myFloat);
    //    System.out.println("Calculated float value: " + anotherFloat);
    //    boolean isTrue = true;
    //    if (isTrue) {
    //      System.out.println("이건트루입니다");
//    //    } else {
//          System.out.println("이건펄스입니다");
//    {

    int a = 1;
    int b = a;
    a = 3;
    System.out.println(b);
    String str1 = "str";
    String str2 = str1;
    str1 = "newString";

    System.out.println(str2);
  }

  @Override
  public void test() {

  }
}
