package day0614;

public class Main {
    public static void main(String[] args) {
//        divide(1,0);
        try {
            divide(1, 0);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int divide(int a, int b) throws CustomException {
        if (b == 0) throw new CustomException("0으로 나눌 수 없습니다");
        else return a / b;
    }
}
