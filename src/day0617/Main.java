package day0617;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car kiaCar = new KiaCar("엔진", 1000000, "타이어");
        KiaCar car = (KiaCar) kiaCar;
        car.printKia();
        List<Integer> list = new ArrayList<>();
        System.out.println(kiaCar.showEngine());
        System.out.println(kiaCar.amountNavi());
        System.out.println(kiaCar.getTier());
    }
}
