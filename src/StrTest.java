public class StrTest {
  public static void main(String[] args) {
    String str01 = "Hello";
    String str02 = "Hello";
    String str03 = "World";
    String str04 = "HelloWorld";

    String[] strings = {"Hello", "Hello", "HelloWorld"};

    System.out.println("(str02 + str03) == strings[02] ? " + ((str02 + str03) == strings[02])); //false
    System.out.println("(str02 + str03).equals(str04) ? " + ((str02 + str03).equals(str04))); //true
    System.out.println("(str02 + str03) == str04 ? " + ((str02 + str03) == str04)); //false
    System.out.println("\"Hello\" + \"World\" == \"HelloWorld\" ? " + ("Hello" + "World" == "HelloWorld")); // true
    System.out.println("\"Hello\" + \"World\" == str04 ? " + ("Hello" + "World" == str04)); // true
    System.out.println("(str02 + str03) == \"HelloWorld\" ? "+ ((str02 + str03) == "HelloWorld")); // false
//    System.identityHashCode(str01);
//    System.identityHashCode(str02);
//    System.identityHashCode(strings[0]);
//    System.identityHashCode(strings[1]);
//
//    System.out.println("변수에 할당된 문자열 비교");
//    System.out.println("str01의 해시코드 : " + System.identityHashCode(str01));
//    System.out.println("str02의 해시코드 : " + System.identityHashCode(str01));
//
//    System.out.println("=".repeat(20));
//
//    System.out.println("배열 내의 문자열 비교");
//    System.out.println("strings[0]의 해시코드 : " + System.identityHashCode(strings[0]));
//    System.out.println("strings[1]의 해시코드 : " + System.identityHashCode(strings[1]));
//    System.out.println(
//        "strings[2] substring 적용 후 해시코드 : " + System.identityHashCode(strings[2].substring(0, 5)));
//
//    System.out.println("=".repeat(20));
//
//    System.out.println("배열 내/외의 문자열 비교 : str01 == strings[0] ? " + (str01 == strings[0]));
//
//    String s1 = "cat";
//    String s2 = new String("cat");
//
//    System.out.println("s2.intern()을 수행하기 전 : " + (s1 == s2));  // false
//    String s = s2.intern();
//    System.out.println("s2.intern()을 수행한 후 : " + (s1 == s));  // false
//    System.out.println("원래 객체와의 비교 : " + (s == s2));

  }
}
