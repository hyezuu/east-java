import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1. 덧셈, /2. 뺄셈, /3. 곱셈, /4. 나눗셈, /0.종료");

            int function = scanner.nextInt();
            if (function == 0) {
                System.out.print("계산기를 종료합니다.");
                break;
            }
            while (function > 4 || function < 0) {
                System.out.println("올바른 입력이 아닙니다. 다시 입력해 주세요.");
                System.out.println("1. 덧셈, /2. 뺄셈, /3. 곱셈, /4. 나눗셈, /0.종료");
                function = scanner.nextInt();
            }

            System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
            long num1 = scanner.nextLong();

            System.out.println("두번째 값을 입력하고 엔터를 누르세요");
            long num2 = scanner.nextLong();

            while (function == 4 && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다! 두번째 값을 다시 입력해 주세요");
                num2 = scanner.nextInt();
            }

            String[] operators = {"+", "-", "*", "/"};
            double result =
                    switch (function) {
                        case 1 -> num1 + num2;
                        case 2 -> num2 - num1;
                        case 3 -> num1 * num2;
                        case 4 -> (double) num1 / num2;
                        default -> 0 ;
                    };

            String answer = (function == 4 && num1%num2 != 0) ? String.format("%.2f", result) : String.valueOf((int)result);

            System.out.printf("%d %s %d = %s", num1, operators[function - 1], num2, answer);
            System.out.println();
        }
    }
}
