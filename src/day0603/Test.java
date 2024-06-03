package day0603;

public class Test {
    public static void main(String[] args){
//        int number1 = 10;
//        int number2 = 3;
//
//        int sum = number1 + number2;
//        int diff1 = number2 - number1;
//        int diff2 = number1 - number2;
//
//        int product = number1 * number2;
//        int quot = number1 / number2;
//        int remainder = number1 % number2;
//
//        System.out.println("덧셈" + sum);
//    System.out.println("뺄셈" + diff1);
//    System.out.println("뺄셈" + diff2);
//    System.out.println("곱셈" + product);
//    System.out.println("나눗셈" + quot);
//    System.out.println("나머지" + remainder);
//
//    byte a = 1;
//    byte b = 2;
//
//    byte c = (byte) (a+b);
//        int score = 95;
//        char grade;
//
//        if(score >= 90) grade = 'A';
//        else grade = 'B';

        //        int a = 20;
//        int b = 10;
//        String str1 = "a is greater than b";
//        String str2 = "a is less than b";
//        String str3 = "a and b are equal";
//
////        if (a > b) {
////            System.out.println(str1);
////        } else if (a < b) {
////            System.out.println(str2);
////        } else System.out.println(str3);
//
//
//
//        System.out.println( a>b ? str1 : a<b ? str2 : str3 );
        System.out.println("=".repeat(15));
        System.out.println("case1");
        int x = 10;
        System.out.println(x > 0 ? "양수" : "음수");

        System.out.println("=".repeat(15));
        System.out.println("case2");
        int score = 75;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else System.out.println("F");

        System.out.println("=".repeat(15));
        System.out.println("case3");

        int year = 2023;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("윤년");
        } else System.out.println("윤년아님");

        System.out.println("=".repeat(15));
        System.out.println("case4");
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(Math.max(a, Math.max(b, c)));

        System.out.println("=".repeat(15));
        System.out.println("case5");
        int passScore = 60;
        int myScore = 75;
        System.out.println(myScore >= passScore ? "합격" : "불합격");
  }
}
