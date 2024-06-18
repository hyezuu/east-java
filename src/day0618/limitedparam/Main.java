package day0618.limitedparam;

public class Main {
    public static void main(String[] args) {
        compareString("yes", "yes1");
    }


    /**
    메서드 이름은 compareStirng t1,t2 매개변수 반환값 void 타입 파라미터 한정자가 String
    내부 로직은 문자열이 같으면 okay 출력 틀리면 no 출력
     */


    public static <T extends String> void compareString (T t1, T t2){
        System.out.print(t1.equals(t2) ? "okay" : "no");
    }
}
