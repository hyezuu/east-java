public class Equals {
  public static void main(String[] args) {
    String a = "hello";
    String c = new String("hello");

    //    System.out.println(a.equals(b)); // true
    //    System.out.println(a == b); // falss
    //    System.out.println(a.indexOf('h'));
    //    System.out.println(a.indexOf('i'));
    //    System.out.println(a.indexOf('l'));
    System.out.println(c.contains("h"));

    String b = "ESTSOFT";
    System.out.println(b.contains("SOFT"));
  }
}
