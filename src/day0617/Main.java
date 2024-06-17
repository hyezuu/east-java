package day0617;

public class Main {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("엔진", 1000000, "타이어");

        System.out.println(kiaCar.showEngine());
        System.out.println(kiaCar.amountNavi());
        System.out.println(kiaCar.getTier());
    }
}
