package car;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(3);
        car.setSpeed(100);
        car.checkSpeed();
        Car.main(new String[0]);
    }
}
