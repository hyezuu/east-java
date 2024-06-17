package generic;

public class Main {
    public static void main(String[] args) {
        Car<String> stringCar = new Car<>();

        stringCar.set("붕붕카");
        System.out.println(stringCar.get());
        System.out.println(stringCar.isIns());
    }
}
