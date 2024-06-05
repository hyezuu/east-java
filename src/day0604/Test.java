package day0604;

import java.util.stream.IntStream;

public class Test {
  public static void main(String[] args) {
    //            int i = 10;
    //            while (i >= 0) {
    //                System.out.println("현재 카운트 : "+ i);
    //                i--;
    //            }
    //            System.out.println("카운트 종료");

    //        int i = 0;
    //        int sum = 0;
    //        int avg = 0;
    //        int[] numbers = {5,2,9,1,7,4,6,3,8};
    //        while(i < numbers.length){
    //            sum += numbers[i];
    //            i++;
    //        }
    //        System.out.println("sum: " + sum);
    //        System.out.println("avg: " + (sum / numbers.length));

    //        int[] numbers = {5,2,9,1,7,4,6,3,8};
    //
    //        double v = IntStream.of(numbers)
    //                .average()
    //                .orElse(0.0);
    //
    //        System.out.println(v);

    //    int i = 0;
    //    while (i <= 300) {
    //      if (i % 3 == 0) {
    //        System.out.println(i);
    //      }
    //      i++;
    //    }

    //        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    //        int index = 0;
    //        int sumPositive = 0;
    //        int sumNegative = 0;
    //
    //        while(index < numbers.length){
    //            if(numbers[index] > 0)
    //                sumPositive += numbers[index];
    //            else
    //                sumNegative += numbers[index];
    //
    //            index++;
    //        }
    //        System.out.println("positive: " + sumPositive);
    //        System.out.println("negative: " + sumNegative);
    //    int sum = 0;
    //    for (int i = 1; i <= 100; i++) {
    //      if (i % 2 == 0) {
    //        sum += i;
    //      }
    //    }
    //
    //    sum = IntStream.range(0, 101).filter(i -> i % 2 == 0).sum();
    //
    //    System.out.println(sum);

    /*문제:
    사용자로부터 정수 n을 입력받아, 1부터 n까지의 정수 중에서 3의 배수이면서 5의 배수인 수의 합을 계산하여 출력하는 프로그램을 작성하세요.
    예시:

    입력: 20
    출력: 30

    설명:
    1부터 20까지의 정수 중에서 3의 배수이면서 5의 배수인 수는 15 하나뿐입니다. 따라서 출력 결과는 15의 합인 30입니다.
    이 문제에서는 for문을 사용하여 1부터 n까지의 정수를 순회하면서, 3의 배수이면서 5의 배수인 수를 찾아 그 합을 계산해야 합니다.*/
    //    for (int i = 1; i <= 10; i++) {
    //      if (i == 4 || i == 7) continue;
    //      System.out.println(i);
    //    }

    //
    //    int a = IntStream.rangeClosed(1, 20).filter(i->i%15==0).sum();
    //    System.out.println(a);
    //
    //        int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    //        int sum = 0;
    //        for (int score : scores) {
    //          sum += score;
    //        }
    //        int avg = sum / scores.length;
    //        System.out.println("총합 : " + sum);
    //        System.out.println("평균 : " + avg);
    //    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde", "123"};
    //
    //    for (String str : arr) {
    //      if (str.length() >= 5) {
    //        System.out.println(str);
    //      }
    //    }

    //    for (int i = 9; i > 1; i--) {
    //      System.out.println(i + "단 시작");
    //      for (int j = 1; j <= 9; j++) {
    //        System.out.println(i + "*" + j + " = " + (i * j));
    //      }
    //    }

    //    int i = 0; // 초기화
    //
    //    while (i < 10) { // 조건 검사
    //      if (i == 5) {
    ////        i++; // 업데이트 <- 해당 코드가 왜 들어갔는지 생각해봅시다.(1)
    //        continue; // i가 5일 때 건너뛰기
    //      }
    //      System.out.println(i);
    //      i++; // 업데이트
    //    }

    String[] words = {"apple", "banana", "cherry", "durian"};

    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        System.out.println(words[i] + " " + words[j]);
      }
    }
  }
}
