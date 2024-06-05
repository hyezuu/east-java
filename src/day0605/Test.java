package day0605;

import java.util.*;

public class Test {
  public String test1(String my_string, int s, int e) {
    StringBuilder sb = new StringBuilder();
    int tmp = e;
    for (int i = 0; i < my_string.length(); i++) {
      sb.append(my_string.charAt(i >= s && i <= e ? tmp-- : i));
    }

    return sb.toString();
  }
  public String test2(String my_string,  int s, int e){
    StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
    answer.reverse();
    return my_string.substring(0, s) + answer + my_string.substring(e + 1);
  }
  public static void main(String[] args) {
      Test T = new Test();
      String my_string = "Progra21Sremm3";
      int s = 6;
      int e = 12;

      long startTime = System.nanoTime();
      String result1 = T.test1(my_string, s, e);
      long endTime = System.nanoTime();
      long duration1 = endTime - startTime;
      System.out.println("test1 duration: " + duration1 + " nanoseconds");

      startTime = System.nanoTime();
      String result2 = T.test2(my_string, s, e);
      endTime = System.nanoTime();
      long duration2 = endTime - startTime;
      System.out.println("test2 duration: " + duration2 + " nanoseconds");

      System.out.println("test1 result: " + result1);
      System.out.println("test2 result: " + result2);


    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.println("1에서 4 사이의 숫자를 입력하세요");
    //    int a = sc.nextInt();
    //    switch (a) {
    //      case 1:
    //        System.out.println("봄을 선택하셨네요");
    //        break;
    //      case 2:
    //        System.out.println("여름을 선택하셨네요");
    //        break;
    //      case 3:
    //        System.out.println("가을을 선택하셨네요");
    //        break;
    //      case 4:
    //        System.out.println("겨울을 선택하셨네요");
    //        break;
    //      default:
    //        System.out.println("잘못된 입력입니다!");
    //    }
    //    sc.close();
    //    Random rand = new Random();
    //
    //    Set<Integer> set = new TreeSet<>();
    //
    //    while (set.size() < 6) {
    //      set.add(rand.nextInt(45)+1);
    //    }
    //
    //    for (int a : set) {
    //      System.out.println(a);
    //    }
    //    Scanner sc = new Scanner(System.in);
    //    Random random = new Random();
    //
    //    int ranNum = random.nextInt(100)+1;
    //    int userNum;
    //
    //    do{
    //        System.out.println("1부터 100사이의 숫자를 입력하세요");
    //        userNum= sc.nextInt();
    //      if (userNum > ranNum) System.out.println("그것 보단 작습니다");
    //      else if (userNum < ranNum) System.out.println("그것 보단 큽니다");
    //    } while (userNum!=ranNum);
    //
    //    System.out.println("정답입니다!");

    //    Scanner scanner = new Scanner(System.in);
    //    System.out.println("영화 제목을 입력하세요");
    //    String movieName = scanner.nextLine();
    //    System.out.println("관람 인원 수를 입력하세요");
    //    int quantity = scanner.nextInt();
    //    scanner.nextLine();
    //    System.out.println("예매자 성함을 입력하세요");
    //    String name = scanner.nextLine();
    //    System.out.println("예매자 연락처를 입력하세요");
    //    String phone = scanner.nextLine();
    //
    //    int price = 10000;
    //    int totalPrice = quantity * price;
    //
    //    System.out.println("===== 영화 티켓 예매 정보 =====");
    //    System.out.println("영화 제목: " + movieName);
    //    System.out.println("관람 인원: " + quantity);
    //    System.out.println("예매자 이름: " + name);
    //    System.out.println("예매자 전화번호: " + phone);
    //    System.out.println("총 결제 금액: " + totalPrice);
  }
}
