package day0607;

import java.util.Scanner;

public class Algorithm {
  public static void main(String[] args) {
    // static ==> 클래스 레벨의 필드와 메서드를 정의할 때 사용하는 키워드
    // 클래스 레벨 ==> 인스턴스에 속하는게 아니다
    //    System.out.println(MyClass.staticNum);
    //    MyClass.staticMethod();
    //    System.out.println(getMiddleThree("1231412"));
    //    barkingDogProblem(true, 6);
    //    barkingDogProblem(true, 7);
    //    barkingDogProblem(false, 5);
    Scanner sc = new Scanner(System.in);
    //    printCategory(sc.nextLine());
    //    printCharacter(sc.nextLine());
    System.out.println(search(new int[] {1, 2, 3, 4, 5}, 5));
  }

  /*
    * 예제1
  입력: “Monitor”
  출력: “nit”
  요구사항
  문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
  문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.*/
  public static String getMiddleThree(String str) {
    int len = str.length();
    int s = (str.length() - 3) / 2;

    return len < 3 ? str : str.substring(s, s + 3);
  }

  public static String barkingDogProblem(boolean bark, int hour) {
    if (bark && hour < 7 || hour >= 20) {
      return "짖으면 안돼!";
    }
    return "든든하군";
  }

/*   * 주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
   *
   * <p>"When organizing items, always label each group with the appropriate category. category:
   * books, category: electronics, category: clothing, category: kitchenware, and so on. "*/
  public static void printCategory(String str) {
    while (str.contains("category: ")) {
      int startIndex = str.indexOf("category: ") + 10;
      int endIndex = str.indexOf(",", startIndex);
      System.out.println(str.substring(startIndex, endIndex));
      str = str.substring(endIndex + 1); // ',' 다음 부분부터 시작하도록 설정
    }
  }

  public static void printCharacter(String str) {
    for (char a : str.toCharArray()) {
      System.out.println(a);
    }
    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(str.length() - 1 - i));
    }
  }

  /*
   *    배열안에서 특정한 데이터를 찾는 함수를 만들어보세요. 찾을 수 있으면 해당원소의 index 값을 반환하고, 찾지 못하면 -1을 반환합니다.
   * search(new int[] {1,2,3,4,5}, 5); ==> 4
   * search(new int[] {1,2,3,4,5}, 6); ==> -1
   */

  static int search(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) return i;
    }
    return -1;
  }

  //    static void printCategory(String str){
  //      int i =0;
  //      while(true){
  //        // i 의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색합니다.
  //        int idx = str.indexOf("category:", i);
  //        if(idx == -1){
  //          break;
  //        }
  //
  //        int startIdx = idx + 9;
  //        int endIdx = str.indexOf(',', startIdx);
  //
  //        System.out.println(str.substring(startIdx, endIdx));
  //
  //        i = endIdx+1;
  //      }
  //    }
  //    while (str.contains("category: ")) {
  //      System.out.println(str.substring(str.indexOf("category: "), str.indexOf(",")));
  //      str = str.substring(str.indexOf(", "));
  //    }

  //  public class MyClass {
  //    public static int staticNum = 0;
  //
  //    public static void staticMethod() {
  //      System.out.println("this is static method");
  //    }
  //  }
}
