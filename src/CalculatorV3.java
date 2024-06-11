import java.util.Scanner;

public class CalculatorV3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            int function = getFunctionChoice(scanner);

            if (function == 0) {
                System.out.print("계산기를 종료합니다.");
                break;
            }

            double num1 = getNumber(scanner, "첫번째");
            double num2 = getNumber(scanner, "두번째");

            num2 = checkValidNumber(function, num2, scanner);

            double result = calculate(function, num1, num2);
            printResult(function, num1, num2, result);
        }
        scanner.close();
    }
    private double getInput(Scanner scanner) {
        try{
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.print("잘못된 입력입니다. 다시 입력해주세요");
        }
    }

    private static double checkValidNumber(int function, double num2, Scanner scanner) {
        while (function == 4 && num2 == 0) {
            System.out.print("0으로 나눌 수 없습니다! ");
            num2 = getNumber(scanner, "두번째");
        }
        return num2;
    }


    private static int getFunctionChoice(Scanner scanner) {
        while (true) {
            try {
                System.out.println("원하는 기능을 선택하세요");
                System.out.println("1. 덧셈, /2. 뺄셈, /3. 곱셈, /4. 나눗셈, /0. 종료");

                int function = Integer.parseInt(scanner.nextLine());
                if (function >= 0 && function <= 4) {
                    return function;
                } else {
                    System.out.println("올바른 입력이 아닙니다. 다시 입력해 주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
            }
        }
    }

    private static double getNumber(Scanner scanner, String order) {
        System.out.println(order + " 값을 입력하고 엔터를 누르세요");
        return scanner.nextDouble();
    }

    private static double calculate(int function, double num1, double num2) {
        return switch (function) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> (double) num1 / num2;
            default -> 0;
        };
    }

    private static void printResult(int function, double num1, double num2, double result) {
        String[] operators = {"+", "-", "*", "/"};
        String answer = (function == 4 && num1 % num2 != 0) ? String.format("%.2f", result) : String.valueOf((int) result);

        System.out.printf("%d %s %d = %s", (int)num1, operators[function - 1], (int)num2, answer);
        System.out.println();
    }
}
